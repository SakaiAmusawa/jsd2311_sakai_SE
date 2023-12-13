package string;

public class StartsWithDemo {
    public static void main(String[] args) {
        String url = "www.tedu.cn";

        boolean starts = url.startsWith("www.");//比较开头位置是否与给定字符串相符
        System.out.println(starts);

        boolean end = url.endsWith(".cn");//比较结尾位置是否与给定字符串相符
        System.out.println(end);
    }
}
