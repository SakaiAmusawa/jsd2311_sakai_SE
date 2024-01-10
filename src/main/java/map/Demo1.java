package map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

/*        //内部使用链表维护了遍历顺序
        Map<String, Integer> map = new LinkedHashMap<>();*/

        //Map的数据存放
        /*
        V put(K k V v)
        将给定的键值对存入Map中。
        Map要求key不能存在重复
         */
        map.put("chinese", 98);
        map.put("math", 97);
        map.put("english", 96);

        System.out.println(map);

        //不可以用基本类型的值来接受返回值 应该使用对应的类型来接收
        //int value = map.put("jp", 20); 使用该方法发生空指针异常,应为在拆箱时null无法处理。
        Integer value = map.put("jp", 20);
        System.out.println(value);//不是重复的key,没有发生替换，返回值为null

        value = map.put("chinese", 99);
        System.out.println(value);//重复的key,替换了Chinese中原有的值98,并将该值返回
        System.out.println(map);

        //查看map的元素个数 *注:一组键值对算是一个元素
        int size = map.size();
        System.out.println(size);

        //通过key获取对应的value
        value = map.get("chinese");
        System.out.println("chinese:" + value);
        //当key不存在的时候，返回值为null
        value = map.get("PE");
        System.out.println("PE:" + value);

        //查看是否包含某一key或某一value
        boolean checkKey = map.containsKey("chinese");
        System.out.println(checkKey);
        boolean checkValue = map.containsKey(100);
        System.out.println(checkValue);

        //Map元素的移除
        value = map.remove("jp");//有返回值 即该键对应的值
        System.out.println(value);
        System.out.println(map);
        //当删除键不存在时,返回值为：null

        value = map.remove("s");
        System.out.println(value);
        System.out.println(map);
    }
}
