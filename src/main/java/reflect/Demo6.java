package reflect;

import java.lang.reflect.Method;

/**
 * 在类的外部调用类的私有属性
 */
public class Demo6 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        //Method[] methods = cls.getMethods();//本类公开方法以及超类的方法
        Method[] methods = cls.getDeclaredMethods();//获取本类的公开方法以及私有方法
        for (Method method : methods
        ) {
            System.out.println(method.getName());
        }
        Method method = cls.getDeclaredMethod("heHe");
        method.setAccessible(true);//强行打开访问权限
        method.invoke(o);
        method.setAccessible(false);//用完马上关掉
    }
}
