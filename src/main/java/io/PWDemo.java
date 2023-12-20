package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 缓冲字符流，总是以块读写保证读写文本的效率
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("pw.txt");

        pw.println("杀马特团长，来沈阳大街指定没有你好果汁吃");
        pw.println("头套给你薅下来");

        System.out.println("写操作完毕！");

        pw.close();
    }
}
