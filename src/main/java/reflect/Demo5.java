package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Person person = new Person();
        person.sayHello();

       Object o = cls.newInstance();

        Method method = cls.getMethod("sayHello");
        method.invoke(o);
    }
}
