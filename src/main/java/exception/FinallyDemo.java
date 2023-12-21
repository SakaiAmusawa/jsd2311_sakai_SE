package exception;

/**
 * finally块是异常处理机制的最后一块。它可以直接跟在try语句块之后或者最后一个catch块之后
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("开始了");
        try {
            String line = "";
            //String line = null;
            System.out.println(line.length());
            //加入return 结束方法 , 如果程序正常，不抛出异常 那么程序不在执行剩余的语句,但是finally语句块的还将继续执行
            return;
        } catch (Exception e) {
            System.out.println("出错了");
            //finally语句块不论有没有异常都会执行
        } finally {
            System.out.println("finally语句块执行了");
        }
        System.out.println("结束了");
    }
}
