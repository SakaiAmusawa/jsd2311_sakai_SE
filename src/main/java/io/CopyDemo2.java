package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./image.png");
        FileOutputStream fos = new FileOutputStream("./imageCopy.png");

        long start = System.currentTimeMillis();
        /*
        一块一块的写，称之为块写操作
         */
        /*
        byte[] bytes = new byte[1024 * 10];
        while (fis.read(bytes) != -1) {
            fos.write(bytes);
        }*/

        int len;
        byte[] bytes = new byte[1024 * 10];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        long end = System.currentTimeMillis();
        fis.close();
        fos.close();
        System.out.println("执行完毕！耗时:" + (end - start) + "ms");
    }
}
