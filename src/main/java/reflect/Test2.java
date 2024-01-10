package reflect;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String allName = scanner.nextLine();
        Class cls = Class.forName(allName);
        Object o = cls.newInstance();
        System.out.println(o);
    }
}
