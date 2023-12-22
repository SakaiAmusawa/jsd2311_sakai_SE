package sakai.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * 假设有一个文本文件 "input.txt" 包含一些数字，每行一个数字。现在需要编写一个程序，读取这些数字并计算它们的总和，然后将结果输出到另一个文件 "output.txt" 中。
 */
public class CopyNumber {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("input.txt");
            Random random = new Random();
            int num;
            for (int i = 0; i < 10; i++) {
                num = random.nextInt(10);
                pw.println(num);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
