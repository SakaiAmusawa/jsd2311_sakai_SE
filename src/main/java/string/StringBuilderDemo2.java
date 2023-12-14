package string;

/**
 * StringBuilder&#x7684;&#x6027;&#x80FD;&#x6F14;&#x793A;
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("a");
        for (int i = 0; i < 10000000; i++) {
            builder.append("a");
        }
        System.out.println(builder.length());
        System.out.println("执行完毕");
    }
}
