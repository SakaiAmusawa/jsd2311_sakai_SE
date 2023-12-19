package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./sakaiAmusawa.txt");

        /*fos.write(97);*/

        /*for (int i = 0; i < 26; i++) {
            fos.write(97 + i);
        }*/

        for (int i = 0; i < 128; i++) {
            fos.write(i);
        }

        fos.close();
    }
}
