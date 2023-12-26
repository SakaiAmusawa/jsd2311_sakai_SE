package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cls = Class.forName("reflect.Student");
        Constructor c = cls.getConstructor(String.class, int.class, char.class);
        Object o = c.newInstance("周佳伟", 25, '男');
        System.out.println(o);
    }
}
