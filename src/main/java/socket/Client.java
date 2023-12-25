package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;

    /*
    用于初始化客户端
     */
    public Client() {
        try {
            System.out.println("正在连接服务器");
            socket = new Socket("127.0.0.1", 8088);
            System.out.println("服务器连接成功");
        } catch (IOException e) {
            System.out.println("警告：无法连接服务端");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    /*
    客户端启动的方法
     */
    public void start() {
        //在客户端进行数据的发送 使用OutputStream
        try {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);
            //pw.println("你好服务端！");


            Scanner scanner = new Scanner(System.in);

            //输入一个昵称
            while (true) {
                System.out.println("请输入昵称");
                String nickName = scanner.nextLine();
                if (nickName.trim().isEmpty()) {
                    System.out.println("cant not empty");
                } else {
                    pw.println(nickName);
                    break;
                }
            }

            //启动线程，开始接受其他的聊天信息
            Runnable runnable = new ServerHandler();
            Thread thread = new Thread(runnable);
            //设置为守护线程
            thread.setDaemon(true);
            thread.start();

            while (true) {
                String message = scanner.nextLine();
                if ("exit".equals(message)) {
                    break;
                }
                pw.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                System.out.println("客户端退出");
                //close方法内部会与服务端进行四次挥手
                socket.close();//交互完毕后与服务端断开链接
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 该线程负责不断地读取服务端发来的消息
     */
    private class ServerHandler implements Runnable {
        @Override
        public void run() {
            //接受服务端发回的消息
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String message;
                while ((message = br.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
