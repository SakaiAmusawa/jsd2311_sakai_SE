package collection.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jerry");
        list.add("jack");
        list.add("rose");
        list.add("ada");
        list.add("mike");
        System.out.println(list);

        //用一个集合保存所有人名中的所有字母
        //["t","o","m","j","e","r",....]
        /*
            字符串:split
            "tom".split("")->[t, o, m]
         */
        String[] array = "tom".split("");
        System.out.println(Arrays.toString(array));
        /*
            Arrays.stream(array)->Stream

            将集合中每个字符串按照""拆分，然后将数组变成Stream，在扁平化处理(合流)
         */
        List<String> list2 = list.stream()
                .flatMap(e -> Arrays.stream(e.split("")))
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
