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
    private String[] info;

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
