package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./sakaiAmusawa.bat");//该文件只存储了1和2

        //用一个int类型来接受数据
        int d = fis.read();
        System.out.println(d);//1

        //第二次接受数据
        d = fis.read();
        System.out.println(d);//2

        //第三次接受数据，但是此时该文件中没有第三个数据，所以返回-1
        d = fis.read();
        System.out.println(d);//-1

        //关闭数据流
        fis.close();
    }
}
