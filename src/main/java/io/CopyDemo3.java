package io;

import java.io.*;

/**
 * 缓冲流是一对处理流，在流连接中的作用是保证读写数据的效率
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.png");
        //参数size为设置缓冲区的大小
        BufferedInputStream bis = new BufferedInputStream(fis, 1024 * 10);

        FileOutputStream fos = new FileOutputStream("image03.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos, 1024 * 10);

        int d;
        long start = System.currentTimeMillis();
        while ((d = bis.read()) != -1) {
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("执行完毕，耗时" + (end - start) + "ms");
        bis.close();
        bos.close();
    }
}
