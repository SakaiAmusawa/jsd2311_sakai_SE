package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用指定的构造器实例化对象
 */
public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //类对象的加载
        Class cls = Class.forName("reflect.Person");
        Constructor c = cls.getConstructor();//获取无参构造器
        Object o = c.newInstance();//new Person
        System.out.println(o);

            /*
            通过类对象的getConstructor获取特定的构造器时，需要在参数部分传入该构造器的参数列表
            每个参数对象用对应的类对象即可。保证与实际构造参数列表顺序，个数，类型一致即可
             */
        Constructor c2 = cls.getConstructor(String.class, int.class);
        Object o2 = c2.newInstance("zjw", 25);
        System.out.println(o2);

        Constructor c3 = cls.getConstructor(String.class);
        Object o3 = c3.newInstance("周佳伟");
        System.out.println(o3);
    }
}

