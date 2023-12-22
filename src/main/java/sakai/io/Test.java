package sakai.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 *
 * @author sakai
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String pathName = "./src/main/java/io/";
        File file = new File(pathName);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            //FileInputStream fis = new FileInputStream(files[i].getName());
            int index = files[i].getName().indexOf(".");
            String fileName = files[i].getName().substring(0, index);
            String newFileName = fileName + "_cp.txt";
            FileInputStream fis = new FileInputStream(pathName + files[i].getName());
            FileOutputStream fos = new FileOutputStream(pathName + newFileName);
            int len;
            byte[] data = new byte[1024];
            while ((len = fis.read(data)) != -1) {
                fos.write(data, 0, len);
            }
            fis.close();
            fos.close();
        }


    }
}
