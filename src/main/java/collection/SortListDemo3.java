package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

//        list.add("b");
//        list.add("B");
//        list.add("a");
//        list.add("C");
//        list.add("z");
//        list.add("g");

        list.add("周佳伟");
        list.add("周佳");
        list.add("周佳伟啊");
        System.out.println(list);

        //当排序不符合自己的要求，也可以自己指定一个比较规则
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(list);
    }
}
