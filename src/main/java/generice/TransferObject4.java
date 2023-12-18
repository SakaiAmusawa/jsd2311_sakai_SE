package generice;

public class TransferObject4<T> {
    private T data;

    /**
     * 静态成员的加载优先级更高，因此无法直接使用类上的泛型，如果静态方法上想要使用泛型
     * 则必须在方法上自定义
     * <p>
     * public static  T doSome(){}
     */
    public static <E> E doSome2(E e) {
        return e;
    }

    public T doSome(T t) {
        return t;
    }
}
