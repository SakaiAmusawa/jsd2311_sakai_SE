package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    ServerSocket serverSocket;

    public Server() {
        try {
            System.out.println("正在启动服务端");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    public void start() {
        try {
            System.out.println("等待客户端连接...");
            Socket socket = serverSocket.accept();
            System.out.println("客户端连接完成");

/*            //进行数据的接受
            InputStream is = socket.getInputStream();
            //输出接受的数据
            int d = is.read();
            System.out.println(d);*/

            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String message;
            while ((message = br.readLine()) != null) {
                System.out.println(message);
            }
            //String message = br.readLine();
            //System.out.println(message);
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
