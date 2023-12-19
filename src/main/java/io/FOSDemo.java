package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输出流
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //当文件不存在时文件输出流自动创建该文件
        FileOutputStream fos = new FileOutputStream("./sakaiAmusawa.bat");

/*        File file = new File("./demo.txt");
        FileOutputStream fos1 = new FileOutputStream(file);
        //这是另外的一种构造方法
        */


        /*
        .write(int d)
        写出一个字节，写出给定的int值对应的二进制的“低八位”

         1的二进制:
         00000000 00000000 00000000 00000001
                                    ^^^^^^^^
                                    这就是低八位
         */

        fos.write(1);
        fos.write(2);
        //写入操作
        //fos.write("hello,bro".getBytes());
        //刷新数据流
        fos.flush();
        //关闭流，养成习惯流用完后一定要关闭
        fos.close();
    }
}
