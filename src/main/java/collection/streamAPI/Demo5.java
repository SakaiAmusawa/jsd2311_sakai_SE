package collection.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        //                                                         进行类型转换后要对其进行包装 这就是.boxed()的作用
        List<Double> list1 = list.stream().mapToDouble(e -> e / 2).boxed().collect(Collectors.toList());
        System.out.println(list1);
    }
}
