package thread.api;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("min");
                }
            }
        };
        Runnable normal = new Normal();
        Thread nor = new Thread(normal);

        Thread max = new Max();
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        nor.start();
        max.start();
    }

    public static class Max extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("max");
            }
        }
    }

    public static class Normal implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("nor");
            }
        }
    }
}
