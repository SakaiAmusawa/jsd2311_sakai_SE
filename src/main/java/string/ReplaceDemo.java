package string;


public class ReplaceDemo {
    public static void main(String[] args) {
        String string = "abc123efd456ghi";
/*        string = string.replaceAll("[0-9]+", "number");
        System.out.println(string);*/

        string = string.replaceAll("[a-z]+", "world");
        System.out.println(string);

        String regex = "(nc|jb|nm)";
        String message = "你说nm个jb那，nc玩意";

        message = message.replaceAll(regex, "***");
        System.out.println(message);
    }
}
