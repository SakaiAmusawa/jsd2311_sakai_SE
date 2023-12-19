package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./image.png");
        FileOutputStream fos = new FileOutputStream("./image_cp.png");
        /*
        下面步骤的个人理解
        图片是一个有许多的0和1组成的文件

        定义一个整形数据变量d 用于接受每次的传过来的一个字节的数据 eg:01001011
        然后判断是否读到了结尾（也就是返回值为11111111 11111111 11111111 11111111）
        没有读到结尾那就 继续读下一个字节，然后在写出来，如此往复循环
         */
        int d;
        while ((d = fis.read()) != -1) {
            fos.write(d);
        }
        //关闭流
        fis.close();
        fos.close();
        System.out.println("复制完毕！");
    }
}
