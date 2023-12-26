package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test5 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        Method[] methods = cls.getMethods();
        for (Method m : methods
        ) {
            if (m.getParameterCount() == 0 && m.getModifiers() == Modifier.PUBLIC && m.getName().contains("s")) {
                m.invoke(o);
            }
        }
    }
}
