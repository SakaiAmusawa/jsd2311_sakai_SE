package reflect;

import java.util.Scanner;

/**
 * java反射机制
 * 是动态的，允许程序在运行期间再确定对象的实例化，方法的调用，属性的操作等
 */
public class Demo1 {
    public static void main(String[] args) {
/*        //获取String的类对象
        Class cls = String.class;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入完全限定名");
        String name = scanner.nextLine();
        Class cls = null;
        try {
            cls = Class.forName(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //通过类对象获取其表示的类的完全限定名
        String className = cls.getName();
        System.out.println(className);

        //仅获取类名
        className = cls.getSimpleName();
        System.out.println(className);

        Package pack = cls.getPackage();
        //获取包名
        System.out.println(pack.getName());
        //输出包名
        System.out.println("包名：" + pack);
    }
}
