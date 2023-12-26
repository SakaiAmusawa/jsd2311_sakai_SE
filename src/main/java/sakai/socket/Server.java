package sakai.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    private ServerSocket serverSocket;

    public Server() {
        try {
            serverSocket = new ServerSocket(8088);
            System.out.println("服务器已启动");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    public void start() {
        try {
            System.out.println("等待客户端连接");
            serverSocket.accept();
            System.out.println("成功连接");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public class ClientHandler implements Runnable {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                String nickName = br.readLine();

                String message;
                while ((message = br.readLine()) != null) {
                    System.out.println(nickName + ":" + message);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
