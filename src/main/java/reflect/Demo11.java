package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class Demo11 {
    public static void main(String[] args) {
        Class c = Person.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            boolean mark = m.isAnnotationPresent(AutoRunMethod.class);
            if (mark) {
                System.out.println(m.getName());
            }
        }
    }
}
