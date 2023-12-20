package collection.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 集合的流式操作
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        //接受数据              开启流         进行操作               收集
        List<Integer> list1 = list.stream().map(e -> e * 3).collect(Collectors.toList());
        System.out.println(list1);
        //                                   过滤器 true:通过
        List<Integer> list2 = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(list2);
        //                                  筛选重复元素
        List<Integer> list3 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list3);

        //进行排序 升序/降序
        //这是升序
        // List<Integer> list4 = list.stream().sorted().collect(Collectors.toList());
        //这是降序
        List<Integer> list4 = list.stream().sorted(((o1, o2) -> o2 - o1)).collect(Collectors.toList());
        System.out.println(list4);

        List<Integer> list5 = list.stream().map(e -> e * 3).filter(e -> e % 2 == 0).distinct().sorted((e1, e2) -> e2 - e1).collect(Collectors.toList());
        System.out.println(list5);
    }
}
