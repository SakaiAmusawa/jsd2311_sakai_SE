package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("note2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);//字节转字符串
        BufferedWriter bw = new BufferedWriter(osw);//提供缓冲
        //开启自动flush功能
        PrintWriter pw = new PrintWriter(bw, true);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("write somethings in note");
            String line = scanner.nextLine();
            if ("exit".equalsIgnoreCase(line)) {
                System.out.println("Ending......");
                break;
            }

            //开启自动刷新后，每一次调用.println()后自动调用.flush()
            pw.println(line);
        }
        pw.close();
    }
}
