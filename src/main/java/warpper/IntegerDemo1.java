package warpper;

public class IntegerDemo1 {
    public static void main(String[] args) {
        int a = 3016;
        //Integer i = new Integer(a);
        Integer i = Integer.valueOf(a);
        System.out.println(i);

        Integer i1 = Integer.valueOf(i);
        Integer i2 = Integer.valueOf(i);

        //Integer.valueOf重用了一个字节内的整数对象
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Double d = 30.16;
        Double d1 = Double.valueOf(d);
        Double d2 = Double.valueOf(d);
        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));

    }
}
