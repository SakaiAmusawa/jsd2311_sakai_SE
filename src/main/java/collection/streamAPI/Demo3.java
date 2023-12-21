package collection.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * flatMap:扁平化操作，lambda表达式返回一个String类型
 */
public class Demo3 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList(new String[]{"1", "2", "3"}));
        list.add(Arrays.asList(new String[]{"4", "5", "6"}));
        System.out.println(list);

        List<String> list1 = list.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        System.out.println(list1);
    }
}
