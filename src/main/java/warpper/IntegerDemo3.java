package warpper;

/**
 * 自动拆装箱的演示
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        /*
        编译自动使用了：Integer integer =Integer.valueOf() 称之为装箱
         */
        Integer integer = 123;
        /*
        编译器自动使用了：integer.intValue() 称之为拆箱
         */
        int i = integer;
    }
}
