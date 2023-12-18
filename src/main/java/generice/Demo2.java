package generice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 测试泛型的上边界
 */
public class Demo2 {
    public static void main(String[] args) {
        TransferObject2 t1 = new TransferObject2();//不指定 使用默认的object是允许的

        //TransferObject2<String> t2 = new TransferObject2<>(); //编译不通过，String不是Collection的子类

        //通过，ArrayList和HashSet都是collection的子类
        TransferObject2<ArrayList> t2 = new TransferObject2<>();
        TransferObject2<HashSet> t3 = new TransferObject2<>();
        //包含Collection
        TransferObject2<Collection> t4 = new TransferObject2<>();
    }
}
