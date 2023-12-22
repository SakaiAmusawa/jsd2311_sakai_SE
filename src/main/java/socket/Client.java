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
            while (true) {
                System.out.println("输入想要发送的信息：");
                String message = scanner.nextLine();
                if ("exit".equals(message)) {
                    break;
                }
                pw.println("客户端：" + message);
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
}
