package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //使用for循环给集合list添加元素
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        //获取指定下标开始的子集
        List<Integer> subList = list.subList(3, 8);//含头不含尾
        System.out.println(subList);

        //子集扩大10倍
        for (int i = 0; i < subList.size(); i++) {
            int num = subList.get(i);
            num *= 10;
            subList.set(i, num);
        }

        System.out.println(subList);
        //发现原集合也发生了变化,对子集的操作就是对原集合的操作
        System.out.println(list);

        //删除操作
        List<Integer> subListRemove = list.subList(2, 9);
        subListRemove.clear();//清空操作，再次强调对子集的操作就是对原集合的操作

        System.out.println(list);
    }
}
