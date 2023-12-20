package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("note2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);//字节转字符串
        BufferedWriter bw = new BufferedWriter(osw);//提供缓冲
        PrintWriter pw = new PrintWriter(bw);

        Scanner scanner = new Scanner(System.in);
        System.out.println("write somethings in note");
        String line = scanner.nextLine();
        while (true) {
            if ("exit".equalsIgnoreCase(line)) {
                System.out.println("Ending......");
                break;
            }

            pw.println(line);
            System.out.println("write somethings in note");
            line = scanner.nextLine();
        }
        pw.close();
    }
}
