package homework.day02;

import java.util.Scanner;

/**
 * 正则表达式练习:
 * 1:编写匹配数字的正则表达式,数字至少一位. answer：[0-9]+
 * <p>
 * 2:匹配字符串,要求输入3-15位,内容只能是数字,字母下,划线  answer:[a-z0-9A-Z_]{3,15}
 * <p>
 * <p>
 * 完成下面编程题:
 * 程序启动后,要求用户输入用户名,用户名出现内容要求上述正则表达式2的要求.不匹配则直接
 * 提示用户名有误.
 * 如果无误,则要求用户继续输入年龄,规则为上述正则表达式1的要求,不匹配则提示年龄有误
 * 以上两个输入获取是都要求以字符串形式接受(Scanner的nextLine方法获取)
 * <p>
 * 最后验证年龄在1-100岁之间(包含1和100)
 * 提示:这里可以不用正则表达式验证范围,是否转换为数字判定更方便?
 *
 * @author sakai amusawa
 */
public class Test01 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("input your name");
        String name = scanner.nextLine();
        checkUserName(name);
    }

    public static void checkUserName(String name) {
        String regex = "[a-z0-9A-Z_]{3,15}";
        boolean match = name.matches(regex);
        while (true) {
            if (match) {
                System.out.println("check passed");
                System.out.println("input age");
                String age = scanner.nextLine();
                checkAge(age);
                break;
            } else {
                System.out.println("wrong username,please input again:");
                name = scanner.nextLine();
                match = name.matches(regex);
            }
        }
    }

    public static void checkAge(String age) {
        String regex = "[0-9]+";

        boolean match = age.matches(regex);
        int iAge = Integer.parseInt(age);
        while (true) {
            if (match) {
                if (iAge > 0 && iAge < 101) {
                    System.out.println("true");
                    break;
                } else {
                    System.out.println("wrong age");
                    age = scanner.nextLine();
                    iAge = Integer.parseInt(age);
                }
            } else {
                System.out.println("wrong age input again");
                age = scanner.nextLine();
                iAge = Integer.parseInt(age);
            }
        }

    }
}
