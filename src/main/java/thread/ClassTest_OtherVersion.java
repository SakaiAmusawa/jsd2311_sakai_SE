package thread;

public class ClassTest_OtherVersion {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0, num = 0; i <= 100; System.out.println(num += i), i += 2) ;
        });

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1, num = 0; i <= 100; System.out.println(num += i), i += 2) ;
            }
        };

        thread1.start();
        thread2.start();
    }
}
