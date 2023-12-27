package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;

public class Test10 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Test10.class;
        String packName = c.getPackage().getName();

        File dir = new File(c.getResource(".").toURI());
        File[] files = dir.listFiles(f -> f.getName().endsWith(".class"));

        for (File f : files) {
            String className = f.getName().replaceAll(".class", "");
            Class<?> cls = Class.forName(packName + "." + className);
            if (cls.isAnnotationPresent(AutoRunClass.class)) {
                Object o = cls.getConstructor().newInstance();
                System.out.println("className = " + className);
                Method[] methods = cls.getDeclaredMethods();
                for (Method m : methods) {
                    if (m.isAnnotationPresent(AutoRunMethod.class)) {
                        System.out.println("m.getName() = " + m.getName());
                        AutoRunMethod arm = m.getAnnotation(AutoRunMethod.class);
                        int value = arm.value();
                        System.out.println("value = " + value);
                        for (int i = 0; i < value; i++) {
                            m.invoke(o);
                        }
                    }
                }
            }

        }
    }
}
