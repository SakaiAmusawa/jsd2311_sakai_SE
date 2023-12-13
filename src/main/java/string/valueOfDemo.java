package string;

/**
 * String提供了一组静态的valueOf方法用于将其他类型转化为字符串
 */
public class valueOfDemo {
    public static void main(String[] args) {
        int a = 10;
        String s1 = String.valueOf(a);
        System.out.println(s1);

        double b = 12.5;
        String s2 = String.valueOf(b);
        System.out.println(s2);
    }
}
