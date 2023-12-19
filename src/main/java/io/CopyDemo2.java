package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./image.png");
        FileOutputStream fos = new FileOutputStream("./imageCopy.png");

        int d;
        long start = System.currentTimeMillis();
        byte[] bytes = new byte[1024 * 10];
        while ((d = fis.read(bytes)) != -1) {
            fos.write(bytes);
        }
        long end = System.currentTimeMillis();
        fis.close();
        fos.close();
        System.out.println("执行完毕！耗时:" + (end - start) + "ms");
    }
}
