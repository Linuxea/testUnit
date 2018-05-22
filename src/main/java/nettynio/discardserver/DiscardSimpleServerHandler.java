package nettynio.discardserver;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author linuxea
 * @date 2018/4/12
 */
public class DiscardSimpleServerHandler extends SimpleChannelInboundHandler {
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) {
		
		ByteBuf in = (ByteBuf) msg;
		try {
			while (in.isReadable()) {
				System.out.print((char) in.readByte());
				System.out.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
