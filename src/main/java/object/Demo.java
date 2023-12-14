package object;

public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        String str = p.toString();
        System.out.println(str);

        //字符串连接时会将p自动转化为String(toString())
        String name = "sakai" + p;
        //想控制台输出一个对象时也是先将p转化为String类型后再输出
        System.out.println(name);


        Point p2 = new Point(1, 2);
        System.out.println(p == p2);
        System.out.println(p.equals(p2));
    }
}
