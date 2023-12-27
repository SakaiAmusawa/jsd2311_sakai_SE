package reflect;

import reflect.annotations.AutoRunClass;

import java.io.File;

public class Test8 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Test8.class;
        String packName = cls.getPackage().getName();

        File dir = new File(
                cls.getResource(".").toURI()
        );
        File[] files = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (File f : files
        ) {
            String className = f.getName().substring(0, f.getName().indexOf("."));
            Class<?> c = Class.forName(packName + "." + className);
            boolean mark = c.isAnnotationPresent(AutoRunClass.class);
            if (mark) {
                Object o = c.getDeclaredConstructor().newInstance();
                System.out.println(o);
            }
        }
    }

}
