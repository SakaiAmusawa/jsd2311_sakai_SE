package homework;

import java.util.Scanner;

/**
 * 要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
 *
 * @author Sakai Amusawa
 */

public class CheckUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your name:");
        String name = scanner.nextLine().trim();

        while (true) {
            if (!name.isEmpty() && name.length() < 20) {
                System.out.println(name);
                break;
            } else {
                System.out.println("error,please input your name again:");
                name = scanner.nextLine().trim() ;
            }
        }
    }
}
