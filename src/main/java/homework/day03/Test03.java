package homework.day03;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 *
 * @author sakai amusawa
 */
public class Test03 {
    public static void main(String[] args) {
        //为了确保集合内不重复使用HashSet
        Collection<Integer> integers = new HashSet<>();

        Random random = new Random();

        //为集合添加元素，为了确保集合内元素有十个，所以用集合的size()来判断，不足十个一直添加
        while (integers.size() < 10) {
            int num = random.nextInt(101);
            integers.add(num);
        }

/*        //使用迭代器遍历集合
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        //方便查看有几个数
        Integer[] array = integers.toArray(new Integer[integers.size()]);
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ":" + array[i]);
        }
    }
}
