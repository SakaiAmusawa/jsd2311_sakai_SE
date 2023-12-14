package string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("好好学习JAVA");
        System.out.println(stringBuilder);

        stringBuilder.append(",为了找个好工作");
        System.out.println(stringBuilder);
        stringBuilder.append("?");
        //可以调用builder的toString()方法获取修改好的字符串
        String str = stringBuilder.toString();
        System.out.println(str);

        stringBuilder.replace(9, 17, "就是为了改变世界");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,8);
        System.out.println(stringBuilder);

        stringBuilder.insert(0,"活着");
        System.out.println(stringBuilder);

        //字符串的反转
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
