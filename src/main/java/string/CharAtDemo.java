package string;

public class CharAtDemo {
    public static void main(String[] args) {
        String url = "www.tedu.cn";
        char c = url.charAt(5);
        System.out.println(c);
        for (int i = 0; i < url.length(); i++) {
            char u = url.charAt(i);
            System.out.println(u);
        }
        //判断回文
        String str = "上海自来水来自海上";
        //方法一：
/*        boolean match = true;
        for (int i = 0; i < str.length() / 2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - 1 - i);
            if (c1 != c2) {
                System.out.println("不是回文");
                match = false;
                break;
            }
        }
        if (match) {
            System.out.println("是回文");
        }*/
        for (int i = 0; i < str.length() / 2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - 1 - i);
            if (c1 != c2) {
                System.out.println("不是回文");
                return;
            }
        }
        System.out.println("是回文");
    }
}
