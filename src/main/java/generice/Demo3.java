package generice;

import object.Point;

public class Demo3 {
    public static void main(String[] args) {
        TransferObject3<String> t = new TransferObject3<>();

        String s = t.doSome2("hello");
        System.out.println(s);
        //                    自动装箱              自动拆箱
        //int i = o.doSome2(Integer.valueOf(123)).intValue();
        int i = t.doSome2(123);
        System.out.println(i);

        Point p = t.doSome2(new Point(1, 2));
        System.out.println(p);
    }
}
