package homework.day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 改错题
 *
 * @author sakai amusawa
 */
public class Test02 {

    //main的拼写错误以及main的参数类型里应该是String数组--->String[]
    public static void main(String[] args) {
        //ArrayList的<>不能省略,里面的泛型可以省略
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        for (String s : c) {
            System.out.println(s);
        }
    }
}



