package thread.concurrent;

/**
 * 在这个示例中，Counter类有两个方法increment()和decrement()来增加和减少计数器的值。这两个方法都使用了synchronized关键字，确保了对count字段的互斥访问。
 * <p>
 * CounterDemo类创建了四个线程，两个线程调用increment()方法，而另外两个线程调用decrement()方法。每个线程都会执行增加或减少操作，每次操作后会打印当前计数器的值以及执行操作的线程名字。通过synchronized关键字，确保了对count字段的安全访问，避免了多个线程同时修改导致的问题。
 */
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Incremented: " + count + " by " + Thread.currentThread().getName());
    }

    public synchronized void decrement() {
        count--;
        System.out.println("Decremented: " + count + " by " + Thread.currentThread().getName());
    }

    public int getCount() {
        return count;
    }
}

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable incrementTask = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable decrementTask = () -> {
            for (int i = 0; i < 5; i++) {
                counter.decrement();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread incrementThread1 = new Thread(incrementTask, "IncrementThread1");
        Thread incrementThread2 = new Thread(incrementTask, "IncrementThread2");
        Thread decrementThread1 = new Thread(decrementTask, "DecrementThread1");
        Thread decrementThread2 = new Thread(decrementTask, "DecrementThread2");

        incrementThread1.start();
        incrementThread2.start();
        decrementThread1.start();
        decrementThread2.start();
    }
}
