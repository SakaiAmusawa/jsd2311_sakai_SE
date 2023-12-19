package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {

    public static void main(String[] args) throws IOException {
        /*writeIn("Hello!");
        writeIn("sakai");*/
        FileOutputStream fos = new FileOutputStream("demo.txt");
        String line = "hello,sakai!";
        byte[] bytes = line.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);
        line = "bye~";
        bytes = line.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);
        fos.close();
    }

/*    public static void writeIn(String line) throws IOException {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        byte[] bytes = line.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);
    }*/
}