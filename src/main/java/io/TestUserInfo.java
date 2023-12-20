package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 实现用户注册功能
 * 将用户在控制台输入的信息以UseInfo的对象形式表示并序列化保存到
 */
public class TestUserInfo {
    public static void main(String[] args) throws IOException {
        UserInfo userInfo = InputUtil.getInputObject(new UserInfo());
        System.out.println(userInfo);

        FileOutputStream fos = new FileOutputStream(userInfo.getUserName() + ".obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(userInfo);
        oos.close();

    }
}
