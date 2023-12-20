package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流的简单演示与操作
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        String message = "9527！出列";
        osw.write(message);
        System.out.println("执行完毕");
        osw.close();
    }
}
