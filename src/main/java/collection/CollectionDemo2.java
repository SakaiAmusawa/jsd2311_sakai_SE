package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*

 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //Collection collection = new HashSet();

        collection.add(new Point(1, 2));
        collection.add(new Point(3, 4));
        collection.add(new Point(5, 6));
        collection.add(new Point(7, 8));
        collection.add(new Point(9, 0));
        collection.add(new Point(9, 0));

        //集合重写了toString(),字符串格式：
        //[元素1.toString,元素2.toString]

        System.out.println(collection);
        /*
        HashSet:
        输出集合发现有重复元素，这是应为没有重写equals方法。
        重写equals后发现不能正常输出(重复的元素不见了)

        ArrayList:
        不受印象
         */


        /*
        判断包含的依据：该元素是否与集合现有元素存在equals比较为true的情况，受重写equals的影响
         */
        Point p = new Point(9, 0);
        boolean contains = collection.contains(p);
        System.out.println(contains);

        /*
        移除元素，在lise中只删除从前往后数的第一个匹配的元素，受重写equals的影响
         */
        collection.remove(p);
        System.out.println(collection);
    }
}
