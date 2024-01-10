package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

/**
 * 访问注解参数
 */
public class Demo12 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("reflect.Person");
        Object o = cls.getConstructor().newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods
        ) {
            if (m.isAnnotationPresent(AutoRunMethod.class)) {
                AutoRunMethod arm = m.getAnnotation(AutoRunMethod.class);
                int value = arm.value();
                System.out.println(value);
            }
        }
    }
}
