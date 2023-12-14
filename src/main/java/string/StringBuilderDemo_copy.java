package string;

/**
 * 该副本展示了stringBuilder的连续调用
 */
public class StringBuilderDemo_copy {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("好好学习JAVA");
        System.out.println(stringBuilder);

        stringBuilder.append(",为了找个好工作").append("?").replace(9, 17, "就是为了改变世界").delete(0, 8).insert(0, "活着").reverse();
        System.out.println(stringBuilder);
    }
}
