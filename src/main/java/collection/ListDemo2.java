package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println(list);

        //将指定元素插入到指定位置
        list.add(2, "six");
        System.out.println(list);

        //将指定位置上的元素删除，并返回
        String old = list.remove(2);
        System.out.println(list);
        System.out.println("被删除元素：" + old);
    }
}
