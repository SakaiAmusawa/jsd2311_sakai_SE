package generice;


public class TransferObject3<T> {
    //泛型可以用于参数
    public void doSome(T t) {

    }

    //当希望方法的参数与返回值类型相同时，可以在方法上单独声明泛型
    public <E> E doSome2(E e) {
        return e;
    }
}
