package warpper;

public class IntegerDemo1 {
    public static void main(String[] args) {
        int a = 3016;
        //Integer i = new Integer(a);
        Integer i = Integer.valueOf(a);
        System.out.println(i);

        Integer i1 = i;
        Integer i2 = i;

        //Integer.valueOf重用了一个字节内的整数对象
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Double d = 30.16;
        Double d1 = d;
        Double d2 = d;
        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));

    }
}
