package thread.concurrent;

public class SyncDemo4 {
    public static void main(String[] args) {
        //StringBuilder sb = new StringBuilder(); //线程不安全，可能发生各种问题，但是效率高

        StringBuffer sb = new StringBuffer();//线程安全，但是效率略低
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    sb.append("abc");
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    sb.append("def");
                }
            }
        };

        t1.start();
        t2.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sb.length());
        System.out.println(sb);
    }
}
