package homework.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 在一个List集合中生成20个随机整数(100以内)
 * 然后按照从小到大的顺序排列，排好后再将第6个-第15个元素
 * 按照从大到小顺序排列，并最终输出集合
 * 例如:
 * 1,2,3,4,5,15,14,13,12,11,10,9,8,7,6,16,17,18,19,20
 *
 * @author sakai amusawa
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        //添加20个随机数到集合中去
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.println("原集合：" + integers);
        //对集合进行排序
        Collections.sort(integers, (o1, o2) -> o1 - o2);
        System.out.println("对整个集合升序后：" + integers);
        //截取数组第6到15位
        List<Integer> list = integers.subList(5, 15);
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println("6-15个元素的降序排列：" + list);
        System.out.println("最终结果：" + integers);
    }
}
