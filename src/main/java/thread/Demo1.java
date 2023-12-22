package thread;

/**
 * 多线程
 * 线程:程序中一个单一的顺序执行流程就是一个线程(线性的执行流程，代码顺序执行)
 * 多线程:多个线程并发执行
 * <p>
 * 创建线程的第一种方式:
 * 继承Thread并重写run方法
 */
public class Demo1 {
    public static void main(String[] args) {
        //线程的简单演示

        //先实例化对象
        Thread thread1 = new myThread1();
        Thread thread2 = new myThread2();
        /*
            启动线程要调用线程的start方法，而非直接调用线程的run方法。
            当调用线程的start方法后，线程就纳入到线程调度器中被统一调度管理，该线程
            第一次分配时间后会自动调用它的run方法开始执行。
         */
        //使用.start()方法启动 而不是run()方法
        thread1.start();//在多线程下,先启动那个线程并不一定那个线程先执行,但是大概率优先
        thread2.start();
    }
}

/**
 * 第一种创建线程方式的优缺点
 * 优点:
 * 结构简单，便于匿名内部类形式创建
 * 缺点:
 * 1:存在继承冲突问题
 * java是单继承，当一个类需要设计为线程，并且同时需要复用另一个类中的方法时，就存在了
 * 需要同时继承两个类的情况，而这是java不允许的。
 * <p>
 * 2:线程任务与线程存在了耦合关系，不利于线程的复用
 * 当我们设计一个线程时，直接重写run方法，将线程任务定义在线程中，导致线程只会干run方法
 * 中的操作，那么这样是不利于线程的重复使用的。
 */
class myThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("虎哥");
        }
    }
}

class myThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("杀马特团长");
        }
    }
}