package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义类型元素的集合
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(55,66));
        list.add(new Point(34,28));
        list.add(new Point(17,22));
        list.add(new Point(15,29));
        list.add(new Point(3,0));
        System.out.println(list);
        /*
            编译不通过，主要原因是集合元素没有实现Comparable接口
            该接口中有一个抽象方法compareTo，用来定义两个元素比较大小的规则
            该方法就是依靠这个方法比较元素的大小从而排序。

            但是这样的操作对我们的代码产生了侵入性
            侵入性:当我们使用某个API方法时，它要求我们为其修改额外的代码，这样的行为就是侵入性
            侵入性不利于代码的后期维护，应当尽量避免
         */
        //compare:比较   comparable:可比较的
//        Collections.sort(list);

//        MyComparator c = new MyComparator();
//        Collections.sort(list,c);

        //匿名内部类形式
        /*
        Comparator<Point> c = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX()+ o1.getY()* o1.getY();
                int len2 = o2.getX()*o2.getX()+ o2.getY()* o2.getY();
                return len1-len2;
            }
        };
        Collections.sort(list,c);
        */


        Collections.sort(list,new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX()+ o1.getY()* o1.getY();
                int len2 = o2.getX()*o2.getX()+ o2.getY()* o2.getY();
                return len1-len2;
            }
        });


        System.out.println(list);
    }
}
/*
class MyComparator implements Comparator<Point>{
    @Override
    */
/**
 *  用来定义o1与o2比较大小的规则
 *  返回值用来表示大小关系
 *  当返回值>0，表达o1>o2
 *  当返回值<0，表达o1<o2
 *  当返回值=0，表达o1=o2
 *//*

    public int compare(Point o1, Point o2) {
        int len1 = o1.getX()*o1.getX()+ o1.getY()* o1.getY();
        int len2 = o2.getX()*o2.getX()+ o2.getY()* o2.getY();
        return len1-len2;
    }
}
*/
