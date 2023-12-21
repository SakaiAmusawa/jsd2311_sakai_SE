package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常处理机制在IO中的应用
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        //流程繁杂
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fos.dat");
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos!=null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
