package lambda;

import java.util.Comparator;

public class LambdaDemo {

    //lambda表达式的演示 ：它允许忽略接口和方法的定义 只保留参数列表以及方法体
    public static void main(String[] args) {
        Comparator<Integer> comparator =
                (Integer o1, Integer o2) -> {
                    return o2 - o1;
                };
        //允许忽略参数
        Comparator<Integer> comparator1 = (o1, o2) -> {
            return o2 - o1;
        };
        //允许忽略方法体的"{}" 前提是方法体中只有一句话，并且删除{}的同时需要删除return关键词
        Comparator<Integer> comparator2 = (o1, o2) -> o2 - o1;
    }


}
