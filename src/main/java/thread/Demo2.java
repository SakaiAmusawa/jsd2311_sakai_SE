package thread;

public class Demo2 {
    public static void main(String[] args) {
        //实例化任务
        /*
        这部分代码创建了两个实现了 Runnable 接口的对象：runnable1 和 runnable2。这些对象实例化了两个不同的类，分别是 MyRunnable1 和 MyRunnable2。
        这种做法允许这两个对象被用作线程的任务，因为它们实现了 Runnable 接口，该接口规定了线程应该执行的任务。通过这种方式，可以在多线程环境中执行各自不同的任务，而不需要继承 Thread 类。
         */
        Runnable runnable1 = new MyRunnable1();
        Runnable runnable2 = new MyRunnable2();

        //实例化线程
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("好果汁吃");
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("指定没你");
        }
    }
}
