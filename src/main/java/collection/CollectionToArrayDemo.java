package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");

        System.out.println("集合collection：" + collection);

        //原始创建一个数组的方法：String[] array = new String[length]
        //下面时将集合转换成数组的操作
        String[] array = collection.toArray(new String[collection.size()]);
        System.out.println("数组：" + Arrays.toString(array));
    }
}
