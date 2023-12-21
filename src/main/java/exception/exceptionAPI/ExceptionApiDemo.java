package exception.exceptionAPI;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        Integer i = null;
        try {
            String line = "abc";
            i = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            e.printStackTrace();

            //获取错误消息 用于往后的错误日志或给用户反馈信息等工作
            String message = e.getMessage();
            System.out.println(message);
        }
        System.out.println(i);
        System.out.println("程序结束了");
    }
}
