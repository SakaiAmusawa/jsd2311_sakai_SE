package thread.api;

/**
 * 睡眠阻塞的中断
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread() {
            @Override
            public void run() {
                System.out.println("lin:睡了");
                try {
                    Thread.sleep(1000 * 60 * 60 * 8);
                } catch (InterruptedException e) {
                    System.out.println("lin:***");
                }
            }
        };


        Thread huang = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("huang:80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("huang:搞定！");
                //调用lin线程的interr方法打断其睡眠阻塞，让其抛出异常
                lin.interrupt();
            }
        };
        lin.setPriority(Thread.MAX_PRIORITY);
        lin.start();
        huang.start();
    }
}
