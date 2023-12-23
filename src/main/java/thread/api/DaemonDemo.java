package thread.api;

/**
 * 守护线程
 * <p>
 * 线程分为两种:守护线程和用户线程
 * 守护线程是通过用户线程调用setDaemon(true)设置而转变过来的。默认创建的线程都是用户线程。
 * <p>
 * 区别:进程结束
 * 当一个进程中的所有用户线程都结束时，进程就会结束，此时会强行杀死所有还在运行的守护线程
 */
public class DaemonDemo {
    public static void main(String[] args) {
        Thread aw = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Let,me sleep");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("aw fell sleep");
            }
        };

        Thread mimi = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("u sleep  i sleep");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        aw.start();
        //设置mimi为守护线程(必须在其启动前设置为守护线程)，当aw线程结束时 mimi线程也结束
        mimi.setDaemon(true);
        mimi.start();
    }
}
