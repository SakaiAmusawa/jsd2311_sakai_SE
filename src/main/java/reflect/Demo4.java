package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * 获取一个类中的方法
 */
public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Person类中的方法信息
//        Class cls = Class.forName("reflect.Person");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

        /*
            Class提供了反应其表示的类的方法信息
            Method[] getMethods()
            Method getMethod(String name,Class...)

            Method类，也是反射对象之一
            它的每一个实例用于表示一个类中的某个方法
            通过Method对象可以反应出该方法的相关信息:
            访问修饰符，返回值类型，方法名，参数信息等
            可以通过方法对象执行这个方法
         */
        //通过类对象获取其表示的类中所有"公开"方法(包含从超类继承的方法)
        Method[] methods = cls.getMethods();
        for(Method method : methods){
            System.out.println(method);
            System.out.println("方法名:"+method.getName());
            //获取该方法的参数个数
            int count = method.getParameterCount();
            System.out.println("参数的个数:"+count);
            //获取该方法的访问修饰符
            int modifiers = method.getModifiers();
            switch (modifiers){
                case Modifier.PUBLIC:
                    System.out.println("公开方法");
                    break;
                case Modifier.PRIVATE:
                    System.out.println("私有方法");
                    break;
                case Modifier.PROTECTED:
                    System.out.println("受保护方法");
                    break;
            }
        }

    }
}
