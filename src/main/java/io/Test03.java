package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 输出io包下的所有文件到控制台
 */
public class Test03 {
    private static final String PATHNAME = "./src/main/java/io/";

    public static void main(String[] args) throws IOException {
        File file = new File(PATHNAME);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
            FileInputStream fis = new FileInputStream(PATHNAME + files[i].getName());
            byte[] bytes = new byte[(int) files[i].length()];
            fis.read(bytes);
            String line = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(line);
            fis.close();
        }

    }
}
