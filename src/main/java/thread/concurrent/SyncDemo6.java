package thread.concurrent;

/**
 * 互斥锁
 */
public class SyncDemo6 {
    public static void main(String[] args) {
        Foo f = new Foo();
        Thread t1 = new Thread(f::methodA);
        Thread t2 = new Thread(f::methodB);
        //没加synchronized 线程异步执行
        //方法A加synchronized
        t1.start();
        t2.start();


    }

}

class Foo {


    public synchronized void methodA() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "正在执行A方法");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(thread.getName() + "A方法执行完毕");
    }

    public synchronized void methodB() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "正在执行B方法");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(thread.getName() + "B方法执行完毕");
    }
}
