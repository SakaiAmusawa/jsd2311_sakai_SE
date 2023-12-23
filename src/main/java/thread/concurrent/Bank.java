package thread.concurrent;

/**
 * 使用当前类演示并发完全问题
 * 并发安全问题:
 * 当多个线程并发操作同一临界资源，由于线程切换时机不确定，导致操作顺序出现混乱从而导致不良后果
 * <p>
 * 临界资源:
 * 操作该资源的过程同一时刻只应被单线程进行
 * <p>
 * 这里以去银行取钱为例，演示效果
 * 场景:
 * 两个人从同一个账号上取款
 */
public class Bank {
    //账户余额
    private int account = 20000;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    /**
     * 当一个方法使用关键字synchronized修饰后，该方法称为"同步方法"，意味着该方法不能同时
     * 被多个线程调用。
     * 只有一个线程完整的将该方法执行完毕，其他线程才可以进到方法内部执行。
     * 将多个线程并发操作改为同步执行(有先后顺序的"排队"执行)可以有效的解决并发安全问题
     * <p>
     * 取款方法
     *
     * @param money 取款金额
     * @return 是否允许出钞
     */
    public synchronized boolean getMoney(int money) {
        int account = getAccount();
        if (account >= money) {
            account -= money;
            Thread.yield();//让线程主动放弃时间片
            setAccount(account);
            return true;
        } else {
            return false;
        }
    }
}
