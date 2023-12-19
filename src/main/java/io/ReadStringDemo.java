package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        //创建一个file对象 用于给byte数组的长度赋值
        File file = new File("note.txt");
        //创建一个输入流用于读取数据
        FileInputStream fis = new FileInputStream(file);

        //创建数组用于接受传来的数组
        byte[] bytes = new byte[(int) file.length()];

        //读取数据
        fis.read(bytes);

        //创建字符串转换字符串
        String line = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(line);

        fis.close();
    }
}
