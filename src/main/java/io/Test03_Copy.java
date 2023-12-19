package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test03_Copy {
    public static final String PATHNAME = "./src/main/java/io/";

    public static void main(String[] args) throws IOException {
        File file = new File(PATHNAME);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            FileInputStream fis = new FileInputStream(PATHNAME + files[i].getName());
            byte[] data = new byte[(int) files[i].length()];
            fis.read(data);
            String message = new String(data, StandardCharsets.UTF_8);
            System.out.println(message);
            fis.close();
        }

    }
}
