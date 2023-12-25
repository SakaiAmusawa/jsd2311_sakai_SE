package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static List<PrintWriter> allOut = new ArrayList<>();
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

            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("客户端连接完成");
                Runnable clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();
/*            //进行数据的接受
            InputStream is = socket.getInputStream();
            //输出接受的数据
            int d = is.read();
            System.out.println(d);*/

            }
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

    private static class ClientHandler implements Runnable {
        /**
         * 这使用了一种参数的传递方式：构造器传递参数
         * 在本例中 定义一个了一个 Socket类型的变量 socket
         * 创建了一个含参构造用于接受外部数据
         * 通过this.socket 为 private final Socket socket提供了引用对象
         * 在下面的run方法中就可以使用start中的socket了
         */
        private final Socket socket;
        private final String host;
        private String nickName;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            //添加了IP地址信息
            host = socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                nickName = br.readLine();

                //将消息发给客户端
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);
                allOut.add(pw);
                sendMessage(nickName + "(" + host + ")" + ":上线了 当前在线人数:" + allOut.size());
                String message;
             /*
                readLine方法用于读取来自客户端发送过来的一行字符串。
                该方法有以下几种现象:
                1:正常返回一行字符串，正常读取
                2:返回null，说明客户端进行了四次挥手与服务端断开链接，不会再发送数据
                3:抛出异常，客户端没有进行四次挥手而异常断开*/
                while ((message = br.readLine()) != null) {
                    //将消息发送会给客户端
                    sendMessage(nickName + "(" + host + ")" + ":" + message);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    //处理客户端断开连接后的操作

                    //将客户端的输出流从集合allOut中移除
                    allOut.remove(pw);
                    sendMessage(nickName + "已退出,当前在线人数:" + allOut.size());
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        /**
         * 广播消息给客户端
         */
        public void sendMessage(String message) {
            //先将消息发送到自己的控制台
            System.out.println(nickName + "(" + host + ")" + ":" + message);
            //将消息广播给所有的客户端
            for (PrintWriter o : allOut
            ) {
                o.println(message);
            }
        }
    }
}
