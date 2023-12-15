package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list);

        /*
        获取集合指定下标处的元素
         */
        String elem = list.get(2);
        System.out.println("获取指定下标的元素：" + elem);

        //List集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*
        将指定元素设置到List中的指定下标处（替换） 有返回值，如不需要返回值可以不接受。
         */
        String old = list.set(2, "2");
        System.out.println(old);//获取被替换的元素
        System.out.println(list);

        //List集合的顺序颠倒
        for (int i = 0; i < list.size() / 2; i++) {
            String num = list.set(i, list.get(list.size() - i - 1));
            list.set((list.size() - 1 - i), num);
        }
        System.out.println(list);

        //Collections给出的反转方法
        Collections.reverse(list);
        System.out.println(list);
    }
}
