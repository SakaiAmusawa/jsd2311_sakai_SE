package thread;

public class Demo1 {
    public static void main(String[] args) {
        //线程的简单演示

        //先实例化对象
        Thread thread1 = new myThread1();
        Thread thread2 = new myThread2();

        //使用.start()方法启动 而不是run()方法
        thread1.start();//在多线程下,先启动那个线程并不一定那个线程先执行,但是大概率优先
        thread2.start();
    }
}

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