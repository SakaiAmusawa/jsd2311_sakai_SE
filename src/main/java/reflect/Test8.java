package reflect;


import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;

/**
 * 调用与test8同包下被注解@AutoRunClass标注的类里所有被注解@AutoRunMethod标注的方法
 */
public class Test8 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Test8.class;
        String packName = cls.getPackage().getName();

        File dir = new File(cls.getResource(".").toURI());
        File[] files = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (File f : files) {
            String className = f.getName().substring(0, f.getName().indexOf("."));
            Class<?> c = Class.forName(packName + "." + className);
            boolean mark = c.isAnnotationPresent(AutoRunClass.class);
            if (mark) {
                Object o = c.getDeclaredConstructor().newInstance();
                Method[] methods = c.getDeclaredMethods();
                for (Method m : methods) {
                    if (m.isAnnotationPresent(AutoRunMethod.class)) {
                        m.invoke(o);
                    }
                }
            }
        }
    }

}
