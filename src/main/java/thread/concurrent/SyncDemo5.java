package thread.concurrent;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * ArrayList HashSet和LinkList都不是并发安全的集合
 */
public class SyncDemo5 {
    public static void main(String[] args) {

        //Collection<Integer> c = new ArrayList<>();
        //Collection<Integer> c = new LinkedList<>();
        //Collection<Integer> c = new HashSet<>();

        //Collections提供了一个可以将现有集合转变为同步的集合，解决了并发安全的问题
        //用法如下
        //Collection<Integer> c = Collections.synchronizedList(new ArrayList<>());
        //Collection<Integer> c = Collections.synchronizedList(new LinkedList<>());
        Collection<Integer> c = Collections.synchronizedSet(new HashSet<>());
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.add(i);
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    c.add(i);
                }
            }
        };

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c.size());
        System.out.println(c);
    }
}
