package string;

public class IndexOfDemo {
    public static void main(String[] args) {
        //                              012345678910 11 12
        String str = "think in java"; //think in java     (空格也算)
        int index = str.indexOf("ava");//检索给定字符串在当前字符串中第一次出现的下标，如果没有则返回-1,区分大小写
        System.out.println(index);
        int nullIndex = str.indexOf("z");
        System.out.println(nullIndex);
        index = str.indexOf("a", 11);//fromIndex指从指定下标开始查找
        System.out.println(index);
        index = str.indexOf(" ", 2);
        System.out.println(index);

        index = str.indexOf("i");
        System.out.println(index);
        index = str.lastIndexOf("i");//查找元素最后一次出现的位置
        System.out.println(index);
    }
}
