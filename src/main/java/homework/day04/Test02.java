package homework.day04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 *
 * @author sakai amusawa
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String pathName = scanner.nextLine();
        File file = new File("./" + pathName);
        while (true) {
            if (file.exists()) {
                System.out.println("文件存在，请更换");
                pathName = scanner.nextLine();
                file = new File(pathName);
            } else {
                file.createNewFile();
                break;
            }
        }
    }
}