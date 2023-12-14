package string;

/**
 * String支持正则表达式的方法一：
 */
public class MatchesDemo {
    public static void main(String[] args) {
        /*
        sakai_Amusawa3016@gmail.com
        表示邮箱的正则表达式：
        [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z])+

        说明：
        + 表示前面一个()/[]内的内容至少出现一次
         */
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        String email = "sakai_Amusawa3016@gmail.com";

        boolean match = email.matches(regex);
        System.out.println(match);
    }
}
