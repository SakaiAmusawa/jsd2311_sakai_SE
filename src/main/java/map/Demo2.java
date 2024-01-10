package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 */
public class Demo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("语文", 99);
        map.put("数学", 98);
        map.put("英语", 97);
        map.put("物理", 96);
        map.put("化学", 99);
        System.out.println(map);

        /*
        遍历所有的key
        当前map中所有的key以一个Set集合形式返回
         */
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        /*
        当前Map中的每一组键值对以一个Entry实例表示,然后以Set集合形式返回所有的键值对
        Entry 常用的方法：
        K getKey();
        V getValue();
         */
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> e : entrySet) {
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + ":" + value);
        }

        /*
        遍历所有的value
        返回类型：collection
         */
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value:" + value);
        }

        //jdk8 使用lambda的遍历
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
