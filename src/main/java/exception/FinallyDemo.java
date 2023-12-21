package exception;

/**
 * finally块是异常处理机制的最后一块。它可以直接跟在try语句块之后或者最后一个catch块之后
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("开始了");
        try {
            //String line = "";
            String line = null;
            System.out.println(line.length());
        } catch (Exception e) {
            System.out.println("出错了");
            //finally语句块不论有没有异常都会执行
        } finally {
            System.out.println("finally语句块执行了");
        }
        System.out.println("结束了");
    }
}
