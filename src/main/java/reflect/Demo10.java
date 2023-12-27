package reflect;

import reflect.annotations.AutoRunClass;

public class Demo10 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        if (mark) {
            System.out.println("被标注了");
        } else {
            System.out.println("未被标注");
        }
    }
}
