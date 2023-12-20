package homework.day05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 *
 * @author sakai amsuawa
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        String pathName = "./src/main/java/homework/day05/";
        File file = new File(pathName);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            FileInputStream fis = new FileInputStream(pathName + files[i].getName());
            int index = files[i].getName().indexOf(".");
            String fn = files[i].getName().substring(0, index);
            String name = fn + "_cp.java";
            FileOutputStream fos = new FileOutputStream(pathName + name);

                byte[] data = new byte[(int) files[i].length()];
                String message = new String(data, StandardCharsets.UTF_8);
                fos.write(message.getBytes(StandardCharsets.UTF_8));
            fos.close();
            fis.close();
        }
        System.out.println("执行完毕");
    }
}


/**
 * 思路:
 * 分为几部分考虑.
 * 第一个是要获取到当前目录中的所有文件(思考哪个API可以解决)
 * 第二个是获取到的每一个文件都要复制(复制用什么API)
 * 第三个是复制的文件名，如何重新组建xxx_cp.xxx的名字?
 * 这里要将原文件名拆开后想办法拼接_cp.
 */


