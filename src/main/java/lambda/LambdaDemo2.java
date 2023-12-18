package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static sakai.DividingLine.dividingLine;

/**
 * lambda与foreach的演示
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);
        dividingLine("新循环");
        //新循环
        for (String s : list) {
            System.out.println(s);
        }
        dividingLine("forEach");
        //forEach方法
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        dividingLine("lambda");
        //lambda表达式
        list.forEach(s -> System.out.println(s));

        //lambda的特殊用法
        list.forEach(System.out::println);
    }
}
