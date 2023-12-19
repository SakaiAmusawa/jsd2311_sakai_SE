package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) throws IOException {
/*        FileOutputStream fos = new FileOutputStream("note.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入信息到你的记事本（exit退出）：");
        String message = scanner.nextLine();
        byte[] bytes = massage.getBytes(StandardCharsets.UTF_8);
        while (!massage.equals("exit")) {
            fos.write(bytes);
            System.out.println("输入信息到你的记事本：");
            massage = scanner.nextLine();
        }
        fos.close;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("write things in your notebook(input exit to quit):");
        String message = scanner.nextLine();
        writeInNote(message);
    }

    public static void writeInNote(String message) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("note.txt");
        //忽略大小写的比较
        while (!"exit".equalsIgnoreCase(message)) {
            byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
            System.out.println("write things in your notebook(input exit to quit):");
            message = scanner.nextLine();
        }
/*        //可读性的升级（强迫症警告：会提示inside loop）
        while (true) {
        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
            if ("exit".equalsIgnoreCase(message))
                break;
            fos.write(bytes);
            System.out.println("输入信息到你的记事本（exit退出）：");
            message = scanner.nextLine();
        }*/
        System.out.println("bye~");
        fos.close();
    }
}
