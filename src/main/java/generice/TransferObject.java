package generice;

/**
 * 泛型
 * 泛型是一种参数化类型
 * 泛型可以
 */
public class TransferObject<T> {
    private String sender;
    private String receiver;
    private T data;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
