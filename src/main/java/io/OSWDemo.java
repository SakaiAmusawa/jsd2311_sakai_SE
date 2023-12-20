package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * 字符流的简单演示与操作
 * 与WriteStringDemo.java进行对比
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        //在此处指定字符集
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

        osw.write("9527！出列");
        osw.write("是，9527出列");
        System.out.println("执行完毕");
        osw.close();
    }
}
