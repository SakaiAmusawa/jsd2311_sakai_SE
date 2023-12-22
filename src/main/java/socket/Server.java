package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public Server() {
        try {
            System.out.println("正在启动服务端");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕");
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
            Socket socket = null;
            while (true) {
                System.out.println("等待客户端连接...");
                socket = serverSocket.accept();
                System.out.println("客户端连接完成");
            }

/*            //进行数据的接受
            InputStream is = socket.getInputStream();
            //输出接受的数据
            int d = is.read();
            System.out.println(d);*/

/*            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String message;
             /*
                readLine方法用于读取来自客户端发送过来的一行字符串。
                该方法有以下几种现象:
                1:正常返回一行字符串，正常读取
                2:返回null，说明客户端进行了四次挥手与服务端断开链接，不会再发送数据
                3:抛出异常，客户端没有进行四次挥手而异常断开

            while ((message = br.readLine()) != null) {
                System.out.println(message);
            }*/
            //String message = br.readLine();
            //System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}
