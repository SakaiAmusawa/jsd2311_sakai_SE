package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流用于对对象的序列化与反序列化
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "sakai amusawa";
        int age = 24;
        String sex = "man";
        String[] otherInFo = {"handsome", "like play game"};

        Person person = new Person(name, sex, age, otherInFo);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /*
        要求：被序列化的对象的类必须实现一个Serializable接口
         */
        oos.writeObject(person);

        System.out.println("执行完毕");

        oos.close();

    }
}
