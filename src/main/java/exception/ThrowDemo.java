package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("年龄为：" + person.getAge());
    }
}
