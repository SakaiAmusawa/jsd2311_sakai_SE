package lambda;

import java.util.*;

/**
 * 创建一个list类型集合，并制定泛型为Integer
 * 存入10个随机数
 * 实现集合的降序排列，要求用lambda创建比较器
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //存入10个随机数
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        //降序排列
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println(list);

    }
}
