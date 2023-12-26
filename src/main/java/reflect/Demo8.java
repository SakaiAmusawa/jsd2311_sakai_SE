package reflect;

import java.lang.reflect.Field;

/**
 * 反射机制操作方法
 */
public class Demo8 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Teacher");
        Object o = cls.newInstance();

        Field field = cls.getField("name");
        field.set(o, "sakai");
        System.out.println(o);
        //私有的属性也可以访问,与访问私有方法的方式相同 在此不再赘述
    }
}
