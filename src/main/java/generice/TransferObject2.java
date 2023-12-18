package generice;

import java.util.Collection;

public class TransferObject2<T extends Collection> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
