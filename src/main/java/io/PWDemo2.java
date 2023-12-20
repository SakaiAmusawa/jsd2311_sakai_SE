package io;

import java.io.*;

/**
 * 组建PrintWrite的流连接
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            文件输出流:字节流，低级流
            作用:负责将写出的字节写入到文件中
         */
        FileOutputStream fos = new FileOutputStream("pw2.txt");

        /*
            转换流:字符流，高级流
            作用:
            1:负责将写出的字符转换为字节
            2:负责衔接字符与字节流

            转换流命名:
            OutputStreamWriter：拆开OutputStream和Writer
            OutputStream是所有字节输出流的超类的名字
            Writer是所有字符输出流超类的名字
            用两个超类名字组合命名为转换流的名字意图就是告诉我们可以将字节流转换为字符流
            有点像"HDMI转VGA"
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        /*
            缓冲字符输出流:字符流，高级流
            作用:
            内部维护一个默认8192长的char数组，以块写来保证写出文本的效率
         */
        BufferedWriter bw = new BufferedWriter(osw);

        /*
            PrintWriter:字符流，高级流
            作用:
            1:按行写出字符串
            2:具有自动行刷新功能(目前还没有涉及到)
         */
        PrintWriter pw = new PrintWriter(bw);

        pw.println("sakai");
        pw.println("amusawa");

        System.out.println("执行完毕");

        pw.close();
    }
}
