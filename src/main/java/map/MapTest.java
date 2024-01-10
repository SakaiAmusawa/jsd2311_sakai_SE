package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        String line = "i love java! thinking in java!! hello world!";
        char[] array = line.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
/*                Integer value = map.get(array[i]);
                if (value == null) {
                    map.put(array[i], 1);
                } else {
                    value = map.get(array[i]);
                    value++;
                    map.put(array[i], value);
                }*/

                //使用三目运算更方便
                map.put(array[i], map.containsKey(array[i]) ? map.get(array[i]) + 1 : 1);
            }
        }
        System.out.println(map);
    }
}
