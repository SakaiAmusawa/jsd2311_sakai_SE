package collection.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Optional<Integer> o = list.stream().max(((o1, o2) -> o1 - o2));
        Optional<Integer> optional = list.stream().min(((o1, o2) -> o1 - o2));
        int max = o.get();
        System.out.println("最大值:" + max);

        int min = optional.get();
        System.out.println("最小值:" + min);

        //有一个匹配
        boolean anyMatch = list.stream().anyMatch(e -> e % 2 == 0);
        System.out.println("是否包含偶数:" + anyMatch);
        //全部匹配
        boolean allMatch = list.stream().allMatch(e -> e > 50);
        System.out.println("元素是否全部大于50:" + allMatch);
        //全部不匹配
        boolean noneMatch = list.stream().noneMatch(e -> e % 2 == 0);
        System.out.println("元素是否不包含偶数:" + noneMatch);
        //累积操作
        //optional = list.stream().reduce((e1, e2) -> e1 + e2);
        optional = list.stream().reduce(Integer::sum);
        int num = optional.get();
        System.out.println(num);
    }
}
