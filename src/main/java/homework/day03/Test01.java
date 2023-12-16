package homework.day03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 改错题
 * <p>
 * 程序需求:向一个List集合中添加10个数字1-10，并将它们
 * 遍历出来并输出到控制台。
 *
 * @author sakai amusawa
 */
public class Test01 {
    public static void main(String[] args) {
        //泛型的位置不能填写基本数据类型
        List<Integer> list = new ArrayList<>();

        //向一个List集合中添加10个数字1-10
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //迭代器不能进行增删该操作！！！
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}





