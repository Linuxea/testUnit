package nettynio;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Linuxea on 2017-08-08.
 */
public class TraditionalServerSocker {

    private ServerSocket serverSocket;

    private void init() throws IOException {
        serverSocket = new ServerSocket(9090);
        while(true){
            Socket socket = serverSocket.accept();
            System.out.println("coming a new guy:" + socket.getRemoteSocketAddress());
            new Thread(new Handle(socket)).start();
        }
    }

    private static class Handle implements  Runnable{

        private BufferedReader bufferedReader=null;
        private PrintWriter printWriter = null;
        private String line;
        private Socket socket;
        public Handle(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run(){
            try {
                bufferedReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
                printWriter = new PrintWriter(socket.getOutputStream());
                while (true){
                    line = bufferedReader.readLine();
                    if(null != line){
                        System.out.println("received:" + line);
                        printWriter.write("return:" + line.getBytes());
                        printWriter.write("\n");
                        printWriter.flush();
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try {
                    printWriter.close();
                    bufferedReader.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }
    }



    public static void main(String[] argc) throws IOException {
        TraditionalServerSocker socket = new TraditionalServerSocker();
        socket.init();
    }

}
