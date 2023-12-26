package reflect;

import java.lang.reflect.Method;

/**
 * 调用有参方法
 */
public class Demo7 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        Method method = cls.getDeclaredMethod("say", String.class, int.class);
        //method = cls.getDeclaredMethod("say", String.class);
        method.invoke(o, "大家好", 5);
    }
}
