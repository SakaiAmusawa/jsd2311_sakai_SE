package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

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
            throw new RuntimeException(e);
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
        try (OutputStream os = socket.getOutputStream()){
            os.write(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
