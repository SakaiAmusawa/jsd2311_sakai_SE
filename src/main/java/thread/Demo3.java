package thread;

/**
 * 匿名内部类的创建方法
 */
public class Demo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Hello");
                }
            }
        };

/*        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("bro");
                }
            }
        };
        Thread t2 = new Thread(r2);*/

        //lambda表达式的使用
        Runnable r2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("bro");
            }
        };
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
