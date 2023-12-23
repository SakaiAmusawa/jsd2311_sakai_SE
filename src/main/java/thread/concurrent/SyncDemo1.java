package thread.concurrent;

public class SyncDemo1 {
    //定义两个boolean类型的值 表示能否取款成功 默认false
    public static boolean success1 = false;
    public static boolean success2 = false;

    public static void main(String[] args) {
        Bank bank = new Bank();
        int num = 0;
        while (true) {
            num++;
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    success1 = bank.getMoney(20000);
                }
            };

            Thread t2 = new Thread() {
                @Override
                public void run() {
                    success2 = bank.getMoney(20000);
                }
            };

            t1.start();
            t2.start();
            if (success1 && success2) {
                System.out.println("出现问题了" + num);
                break;
            } else {
                bank.setAccount(20000);
                success1 = false;
                success2 = false;
            }
        }
    }
}
