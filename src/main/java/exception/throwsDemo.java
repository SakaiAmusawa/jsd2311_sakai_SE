package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 子类重写超类含有throws异常声明方法时，都throws的重写规则
 */
public class throwsDemo {
   public void doSome() throws IOException, AWTException {
    }
}

class subClass extends throwsDemo {
    //可以不抛出异常
//    @Override
//    public void doSome(){
//
//    }


    //可以仅抛出一个异常
//    @Override
//    public void doSome() throws AWTException {
//    }

    //可以抛出全部异常
//    @Override
//    public void doSome() throws IOException, AWTException {
//    }

    //可以抛出超类抛出异常地派生类
//    @Override
//    public void doSome() throws FileNotFoundException {
//    }

    //不可以抛出超类的异常地超类（不允许抛出的异常类型比超类的异常类型还大）
//    @Override
//    public void doSome() throws Exception {
//    }

    //不可抛出超类没有的异常类型
//    @Override
//    public void doSome() throws SQLException {
//    }
}