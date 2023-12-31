package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Person {
    private String name = "zjw";
    private int age = 25;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @AutoRunMethod(5)
    public void sayHello() {
        System.out.println(name + ":hello!");
    }

    @AutoRunMethod
    public void sayHi() {
        System.out.println(name + ":hi!");
    }

    public void doSome() {
        System.out.println(name + ":做某事");
    }

    public void sleep() {
        System.out.println(name + ":在睡觉");
    }

    @AutoRunMethod
    public void watchTV() {
        System.out.println(name + ":在看电视");
    }

    public void study() {
        System.out.println(name + ":在学习");
    }

    @AutoRunMethod
    public void playGame() {
        System.out.println(name + ":在玩游戏");
    }

    public void sing() {
        System.out.println(name + ":在唱歌");
    }

    public void say(String info) {
        System.out.println(name + ":" + info);
    }

    public void say(String info, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name + ":" + info);
        }
    }

    private void heHe() {
        System.out.println("person的私有方法");
    }
}
