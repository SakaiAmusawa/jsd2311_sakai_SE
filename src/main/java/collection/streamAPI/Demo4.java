package collection.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 数组的流式操作
 */
public class Demo4 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //                  开启数组的流
        List<Integer> list = Arrays.stream(integers).filter(e -> e % 2 == 0).map(e -> e * 3).collect(Collectors.toList());
        System.out.println(list);
    }
}
