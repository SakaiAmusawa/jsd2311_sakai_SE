package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
集合间的操作：交集、并集、差集
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add("java");
        collection1.add("c++");
        collection1.add("python");

        Collection collection2 = new HashSet();
        collection2.add("ios");
        collection2.add("android");
        //collection2.add("python");//添加一个重复元素进行测试


        /*
        并集操作
         */
        collection1.addAll(collection2);//在添加重复元素后将c2中的元素向c1中添加 成功
        //collection2.addAll(collection1);////在添加重复元素后将c1中的元素向c2中添加 返现少一个元素 应为set中不允许存在重复元素
        System.out.println(collection1);
        System.out.println(collection2);

/*        //取交集的操作
        Collection collection3 = new ArrayList();
        collection3.add("java");
        collection3.add("android");
        collection3.add("c#");
        System.out.println(collection3);

        collection1.retainAll(collection3);
        System.out.println(collection1);
        System.out.println(collection3);*/

        //差集操作
        Collection collection4 = new ArrayList();
        collection4.add("java");
        collection4.add("android");
        collection4.add("c#");
        System.out.println("c1:" + collection1);
        System.out.println("c4:" + collection4);

        collection1.removeAll(collection4);
        System.out.println("c1:" + collection1);
        System.out.println("c4:" + collection4);

        //全包含
        boolean containsAll = collection1.containsAll(collection4);
        System.out.println(containsAll);
    }


}
