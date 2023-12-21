package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1000);
        System.out.println("年龄为：" + person.getAge());
    }
}
