package thread;

public class Demo2 {
    public static void main(String[] args) {
        //实例化任务
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
