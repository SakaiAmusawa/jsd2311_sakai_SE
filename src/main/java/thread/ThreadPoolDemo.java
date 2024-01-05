package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        //将任务交给线程池
        for (int i = 0; i < 5; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName() + "正在执行任务");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(t.getName() + "任务执行完毕");
                }
            };
            threadPool.execute(runnable);
            System.out.println("将一个任务交给了线程池");
        }
        //threadPool.shutdown();
        threadPool.shutdownNow();
    }
}
