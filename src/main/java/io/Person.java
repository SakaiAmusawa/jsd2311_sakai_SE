package io;

import java.io.Serializable;
import java.util.Arrays;


/**
 * 使用当前类测试对象流的序列化与反序列化
 */
public class Person implements Serializable {
    private String name;
    private String sex;
    private int age;
    /*
    简单的说明：加入transient关键字以后 该数据变为瞬时数据 即在对象流中不在保存
    再次输出时发现值为null
     */
    private transient String[] info;

    public Person() {

    }

    public Person(String name, String sex, int age, String[] info) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getInfo() {
        return info;
    }

    public void setInfo(String[] info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", info=" + Arrays.toString(info) +
                '}';
    }
}
