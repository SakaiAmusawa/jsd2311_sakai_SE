package reflect;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 调用与当前类Test7在同一包中所有类里那些本类自己定义的公开,无参且名字中含有S的方法
 */
public class Test7 {
    public static void main(String[] args) throws Exception {
        Class c = Test7.class;
        String packName = c.getPackage().getName();
        System.out.println(packName);

        File dir = new File(Test7.class.getResource(".").toURI());
        System.out.println(dir);

        File[] files = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (int i = 0; i < files.length; i++) {
            //System.out.println(files[i].getName());
            String className = files[i].getName().substring(0, files[i].getName().indexOf("."));
            //System.out.println(className);
            Class cls = Class.forName(packName + "." + className);
            System.out.println("实例化对象:" + className);
            Object o = cls.getDeclaredConstructor().newInstance();
            Method[] methods = cls.getDeclaredMethods();
            for (int j = 0; j < methods.length; j++) {
                if (methods[j].getParameterCount() == 0 && methods[j].getModifiers() == Modifier.PUBLIC && methods[j].getName().contains("s")) {
                    System.out.println("调用方法:" + methods[j].getName());
                    methods[j].invoke(o);
                }
            }

        }
    }
}
