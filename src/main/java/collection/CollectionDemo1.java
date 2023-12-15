package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection collections = new ArrayList();
        //向集合中添加元素
        collections.add("Hello");
        collections.add("sakai");
        collections.add("amusawa");
        collections.add(3016);
        collections.add("!");
        System.out.println(collections);

        //集合的长度
        int size = collections.size();
        System.out.println(size);

        //集合是否为空
        boolean isEmpty = collections.isEmpty();
        System.out.println("isEmpty:" + isEmpty);

        //清空集合
        collections.clear();
        System.out.println(collections);
        System.out.println("size:" + collections.size());
        System.out.println("isEmpty:" + collections.isEmpty());
    }
}
