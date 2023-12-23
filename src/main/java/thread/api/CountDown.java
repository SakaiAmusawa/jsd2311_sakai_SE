package thread.api;

import java.util.Scanner;

/**
 * 创建一个简易地倒计时程序
 * <p>
 * 用户输入一个整数，程序开始按用户输入的数每秒倒计时
 */
public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数开始倒计时");
/*        int time = scanner.nextInt();

        for (int i = 0; i < time; i++) {
            System.out.println(time - i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        //简化
        for (int i = scanner.nextInt(); i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
