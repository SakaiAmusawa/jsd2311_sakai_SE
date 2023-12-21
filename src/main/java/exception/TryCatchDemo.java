package exception;

import java.io.IOException;

/**
 *
 */
public class TryCatchDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("程序开始执行");

        try {
            String line = "abc";
            System.out.println(line.length());
            System.out.println(line.charAt(1));
            System.out.println(Integer.parseInt(line));
            //try中出现异常以后的代码都不会输出
            System.out.println("!!!");
        }/*catch (NullPointerException e) {
            System.out.println("出现了异常，抛出了异常，输出了该句话");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("出现了下标越界异常，抛出了异常，输出了该句话");
        }*/ catch (StringIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("出现了空指针或下标越界异常");
        } catch (Exception e) {
            System.out.println("未知错误");
        }
        System.out.println("程序结束");
    }
}
