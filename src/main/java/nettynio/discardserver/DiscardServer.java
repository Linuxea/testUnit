package nettynio.discardserver;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author linuxea
 * @date 2018/3/8
 */
public class DiscardServer {
	
	private int port;
	
	public DiscardServer(int port) {
		this.port = port;
	}
	
	public static void main(String[] args) {
		try {
			new DiscardServer(1999).run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void run() throws InterruptedException {
		
		EventLoopGroup bossGroup = new NioEventLoopGroup();
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			ServerBootstrap serverBootstrap = new ServerBootstrap();
			serverBootstrap.group(bossGroup, workerGroup)
					.channel(NioServerSocketChannel.class)
					.childHandler(new ChannelInitializer<SocketChannel>() {
						
						@Override
						protected void initChannel(SocketChannel ch) {
							ch.pipeline().addLast(new DiscardServerHandler());
						}
					})
					.option(ChannelOption.SO_BACKLOG, 128)
					.childOption(ChannelOption.SO_KEEPALIVE, true);
			
			ChannelFuture sync = serverBootstrap.bind(this.port).sync();
			sync.channel().closeFuture().sync();
		} finally {
			bossGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
		
	}
	
}
