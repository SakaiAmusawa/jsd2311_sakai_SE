package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲输出流的写缓冲问题
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("FlushDemo.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String line = "sakai amusawa";
        byte[] bytes = line.getBytes(StandardCharsets.UTF_8);
        bos.write(bytes);
        bos.flush();
        //close()中包含flush()方法，flush的使用情况根据实际情况而定
        bos.close();
    }
}
