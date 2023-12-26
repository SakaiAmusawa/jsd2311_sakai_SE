package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入类名");
        String className = scanner.nextLine();
        System.out.println("输入方法名");
        String methodName = scanner.nextLine();

        Class cls = Class.forName(className);
        Object o = cls.newInstance();

        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
