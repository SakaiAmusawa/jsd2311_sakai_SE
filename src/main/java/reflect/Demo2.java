package reflect;

public class Demo2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Person person = new Person();
        System.out.println(person);

        //1获取类对象
        Class cls = Person.class;
        //2通过类对象的Instance()方法调用该类的无参构造器
        Object person2 = cls.newInstance();
        System.out.println(person2);
    }
}
