package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符输入流
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        String message;
        while ((message = br.readLine()) != null) {
            System.out.println(message);
        }
        br.close();
    }
}
