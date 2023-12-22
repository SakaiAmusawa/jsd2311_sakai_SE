package thread;

/**
 * 创建两条线程
 * 第一条线程的任务：进行100以内所有奇数相加计算总和
 * 第二条线程的任务：进行100以内所有偶数相加计算总和
 * <p>
 * 每次计算都输出结果
 */
public class ClassTest {
    public static void main(String[] args) {
        Runnable r1 = new OddNumber();
        Runnable r2 = new EvenNumber();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}

class OddNumber implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
                System.out.println("奇数和：" + sum);
            }
        }
    }
}

class EvenNumber implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println("偶数和：" + sum);
            }
        }
    }
}