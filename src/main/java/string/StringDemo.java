package string;

/**
 * String是不变的对象-对象创建后内容不可改变
 * JVM对字符串有一个优化：常量池
 */
public class StringDemo {
    public static void main(String[] args) {
        String a = "123abc";
        String b = "123abc";//对象的重用
        System.out.println(a == b);

        String c = "123abc";
        System.out.println(a == c);//new 一定产生了一个新的对象

        String d = "123" + "abc";//对象重用，这涉及到了Java的预编译操作，该操作直接运算变量 即变量d在被虚拟机运行前已经变为了"123abc"，查看对应的.class文件即可发现。
        System.out.println(a == d);

        String e = "123";
        String e1 = e + "abc";//该处并不会触发与计算特性，应为一侧有变量 //拼接会产生新变量
        System.out.println(e1 == a);

    }
}
