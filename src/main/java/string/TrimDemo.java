package string;

public class TrimDemo {
    public static void main(String[] args) {
        String name = "  sakai Amusawa   ";
        System.out.println(name);
        String trimName = name.trim();
        System.out.println(trimName);//只去除两端的空白字符
    }
}
