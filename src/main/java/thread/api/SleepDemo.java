package thread.api;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
