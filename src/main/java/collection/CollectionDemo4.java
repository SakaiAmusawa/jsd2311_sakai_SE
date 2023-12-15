package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
集合只能存放引用类型元素，存放的是元素的地址
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Point p = new Point(1, 2);
        collection.add(p);//只是向集合中加入了对象p的地址
        System.out.println(p);
        System.out.println(collection);

        p.setX(2);
        System.out.println(p);
        System.out.println(collection);

        doSome(collection, p);
        System.out.println(p);
        System.out.println(collection);
    }

    public static void doSome(Collection c, Point p) {
        p.setX(3);
        p = new Point(4, 5);
        c = new ArrayList();
        c.add(p);
        p.setX(6);
    }
}
