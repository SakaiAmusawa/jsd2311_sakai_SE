package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);

        showInfo();
    }

    static void showInfo() {
        Thread threadShowInfo = Thread.currentThread();
        System.out.println(threadShowInfo);

        //线程的名字
        String name = threadShowInfo.getName();
        //线程的优先级
        int getPriority = threadShowInfo.getPriority();
        //线程的ID
        long id = threadShowInfo.getId();
        //线程是否存活
        boolean alive = threadShowInfo.isAlive();
        //线程是否为守望线程
        boolean isDaemon = threadShowInfo.isDaemon();
        //线程是否被打断
        boolean isInterrupted = threadShowInfo.isInterrupted();

        System.out.println(name + getPriority + id + alive + isDaemon + isInterrupted);
    }
}
