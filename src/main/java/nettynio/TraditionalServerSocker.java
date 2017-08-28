package nettynio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Linuxea on 2017-08-08.
 */
public class TraditionalServerSocker {

    private volatile boolean on = true;
    private ServerSocket serverSocket;

    public static void main(String[] argc) throws IOException {
        TraditionalServerSocker socket = new TraditionalServerSocker();
        socket.init();
        //socket.off();
    }

    public void off() {
        on = false;
    }

    private void init() throws IOException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            serverSocket = new ServerSocket(9090);
            while (on) {
                Socket socket = serverSocket.accept();
                System.out.println("coming a new guy:" + socket.getRemoteSocketAddress());
                executorService.execute(new Handle(socket));
            }
        } finally {
            executorService.shutdown();
        }
    }

    private static class Handle implements Runnable {

        private BufferedReader bufferedReader = null;
        private PrintWriter printWriter = null;
        private String line;
        private Socket socket;

        public Handle(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                printWriter = new PrintWriter(socket.getOutputStream());
                while (true) {
                    line = bufferedReader.readLine();
                    if (null != line) {
                        System.out.println("received:" + line);
                        printWriter.write("return:" + line.getBytes());
                        printWriter.write("\n");
                        printWriter.flush();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    printWriter.close();
                    bufferedReader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
