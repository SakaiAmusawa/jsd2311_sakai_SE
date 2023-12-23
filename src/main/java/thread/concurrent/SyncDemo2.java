package thread.concurrent;

/**
 * 有效地缩小同步范围可以在保证并发安全的前提下尽可能提高并发效率
 * 同步块:
 * synchronized(同步监视器对象){
 * 需要多个线程同步执行的代码片段
 * }
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Shop shop1 = new Shop();
        Thread t1 = new Thread(shop::buy, "zjw");
        Thread t2 = new Thread(shop1::buy, "sakai");

        t1.start();
        t2.start();

    }
}

class Shop {
    //在方法上使用synchronized，那么同步监视器对象不可选，只能是this
//    public synchronized void buy(){
    public void buy() {
        try {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "正在挑衣服");
            Thread.sleep(500);
            /*
                同步监视器的选取原则:
                1:同步监视器对象只能是引用类型
                2:多个需要同步执行该代码块的线程看到的必须是同一个对象

                合适地锁对象
                存在并发安全的情况下多个线程看到的是同一个对象，不存在并发安全的情况下
                看到的应当不是同一个对象
             */
            synchronized (this) {//有效且合适的锁对象
//            synchronized (new Object()) {//一定不可以使用实例化表达式作为同步监视器对象
//            synchronized (123) {//编译不通过，同步监视器对象必须是引用类型
//            synchronized ("hello") {//字面量具有同步效果,但不是合适的锁对象
                System.out.println(thread.getName() + "正在试衣服");
                Thread.sleep(5000);
            }
            System.out.println(thread.getName() + "结账离开");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}