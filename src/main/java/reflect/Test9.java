package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;

/**
 * 调用与test9同包下被注解@AutoRunClass标注的类里所有被注解@AutoRunMethod标注的方法
 */
public class Test9 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Test9.class;
        String packName = c.getPackage().getName();

        File dir = new File(c.getResource(".").toURI());
        File[] files = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (File f : files) {
            String className = f.getName().replaceAll(".class", "");
            String name = packName + "." + className;
            Class<?> cls = Class.forName(name);
            if (cls.isAnnotationPresent(AutoRunClass.class)) {
                Object o = cls.getDeclaredConstructor().newInstance();
                Method[] methods = cls.getDeclaredMethods();
                for (Method m : methods) {
                    if (m.isAnnotationPresent(AutoRunMethod.class)) {
                        m.invoke(o);
                    }
                }
            }
        }
    }
}
