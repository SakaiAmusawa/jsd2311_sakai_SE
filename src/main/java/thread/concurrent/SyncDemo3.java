package thread.concurrent;

/**
 * 静态方法上如果使用synchronized,一定具有同步效果
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Boo boo1 = new Boo();
        Boo boo2 = new Boo();

        Thread t1 = new Thread(() -> boo1.doSome());
        Thread t2 = new Thread(() -> boo2.doSome());

        t1.start();
        t2.start();

    }

}

class Boo {
    //public synchronized static void doSome() {
    public static void doSome() {
        synchronized (Boo.class) {//引用类对象的方式 类名.class
            try {
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName() + "正在执行doSome方法");
                Thread.sleep(1000);
                System.out.println(thread.getName() + "执行doSome方法完毕");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
