package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        //在try的()中进行流的定义并初始化（只有实现autocloseable接口的类才可以放进来）
        try (FileOutputStream fos = new FileOutputStream("sakai.txt")) {
            fos.write(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
