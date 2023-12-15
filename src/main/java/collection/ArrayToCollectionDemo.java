package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollectionDemo {
    public static void main(String[] args) {
        //定义一个数组并输出
        String[] array = {"one", "two", "three", "four", "five"};
        System.out.println("array:" + Arrays.toString(array));

        //创建一个list对象接受从数组转变集合的数据并打印
        List<String> list = Arrays.asList(array);
        System.out.println("list" + list);

        /*
        对数组转化而来的集合进行操作就是对原数组的操作
         */
        list.set(0, "zero");
        System.out.println("list" + list);
        System.out.println("array:" + Arrays.toString(array));//原数组发生改变

        //list.add("everything");//报错，根据上面所说：对数组转化而来的集合进行操作就是对原数组的操作,数组是固定长度的，对其进行.add/.remove操作都是不可行的


        /*
        所有类型的集合都支持一个参数为Collection类型的构造器，作用是在创建当前集合的同时包含给定集合的所有元素
         */
        List<String> listCopy = new ArrayList<>(list);

        listCopy.add("seven");
        listCopy.remove(5);

        System.out.println(listCopy);
    }
}
