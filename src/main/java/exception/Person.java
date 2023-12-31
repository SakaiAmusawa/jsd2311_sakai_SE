package exception;

public class Person {
    private int age;

    public Person() {

    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        //使用throw显示的主动抛出异常
        if (age < 0 || age > 100) {
            //throw new Exception("年龄不合法");
            throw new IllegalAgeException("年龄不合法：" + age);
        }
        this.age = age;
    }
}
