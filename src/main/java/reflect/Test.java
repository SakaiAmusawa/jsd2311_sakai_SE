package reflect;

public class Test {
    public static void main(String[] args) {
        Class cls = Person.class;

        //完全限定名
        String allName = cls.getName();
        System.out.println(allName);

        //仅类名
        String className = cls.getSimpleName();
        System.out.println(className);

        //仅包名
        Package pack = cls.getPackage();
        System.out.println(pack.getName());

    }
}
