package nettynio;

import org.testng.collections.Lists;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * Created by Linuxea on 2017-08-08.
 */
public class TraditionalServerSocker {

    private ServerSocket serverSocket;
    private List<Socket> sockets  = Lists.newArrayList();

    private void init() throws IOException {
        serverSocket = new ServerSocket(9090);
        while(true){
            Socket socket = serverSocket.accept();
            sockets.add(socket);
        }
    }

    public void listen() throws Exception{
        for(Socket socket : sockets){
            while (true){
               try(InputStream inputStream = socket.getInputStream();
                   OutputStream outputStream = socket.getOutputStream();
                   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                   PrintWriter printWriter = new PrintWriter(outputStream)){
                    while(true){
                       String line = null;
                       if(!"exit".equals(line == bufferedReader.readLine())){
                           System.out.println(line);
                           printWriter.write("heh");
                       }else {
                           System.out.println("exit");
                       }
                   }
               }
            }
        }
    }


    public static void main(String[] argc) throws IOException {
        TraditionalServerSocker socket = new TraditionalServerSocker();
        socket.init();
    }

}
