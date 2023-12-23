package thread.concurrent;

public class Bank {
    //账户余额
    private int account = 20000;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    /*
    查看能否取钱
    返回true 表示能够取钱，并会重新设置account的值
    返回false 表示不能够取钱
     */
    public boolean getMoney(int money) {
        int account = getAccount();
        if (account >= money) {
            account -= money;
            //Thread.yield();//让线程主动放弃时间片
            setAccount(account);
            return true;
        } else {
            return false;
        }
    }
}
