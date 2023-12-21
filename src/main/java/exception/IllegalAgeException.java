package exception;

/**
 * 非法的年龄异常
 * <p>
 * 输入的年龄超出范围[0,100)
 * <p>
 * 自定义异常
 * <p>
 * 根据业务需求而来
 * <p>
 * 1.类名做到见名知意
 * 2.继承自异常类
 * 3.提供超类所有的构造器
 */

public class IllegalAgeException extends Exception {

    //提供超类的所有构造器
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
