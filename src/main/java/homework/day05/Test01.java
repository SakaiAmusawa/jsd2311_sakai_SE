package homework.day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 改正下面程序的错误
 * <p>
 * 程序实现的功能需求:复制一个文件
 *
 * @author sakai amusawa
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("demo.txt");
        FileOutputStream fos = new FileOutputStream("demo_cp.txt");

        int d;
        while ((d = fis.read()) != -1) {
            fos.write(d);
        }
        System.out.println("复制完毕!");
        fis.close();
        fos.close();
    }
}