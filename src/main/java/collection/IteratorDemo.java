package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        //c.add(123);add(E e ),由于实参不是String类型，编译不通过

        //迭代器
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            if ("#".equals(e)) {
                /*
                发生错误！迭代器在集合的遍历中不允许的进行删改操作
                 */
                //c.remove("#");
                iterator.remove();
            }
            System.out.println(e);//指定泛型后获取元素时无需造型
        }
        System.out.println(c);
    }
}
