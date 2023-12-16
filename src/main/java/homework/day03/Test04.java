package homework.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合第3到第6个元素翻转并输出
 *
 * @author sakai amusawa
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        //向集合内添加元素
        while (list.size() < 10) {
            int elem = random.nextInt(101);
            list.add(elem);
        }
        System.out.println(list);

        //截取集合的第三到第六个元素
        List<Integer> list_copy = list.subList(2, 6);
        System.out.println(list_copy);

        //反转
        for (int i = 0; i < list_copy.size() / 2; i++) {
            Integer num = list_copy.get(list_copy.size() - 1 - i);
            list_copy.set(list_copy.size() - 1 - i, list_copy.get(i));
            list_copy.set(i, num);
        }
        System.out.println(list_copy);
    }
}
