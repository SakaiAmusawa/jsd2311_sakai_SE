package warpper;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //最大值与最小值的用法
        int iMax = Integer.MAX_VALUE;
        System.out.println(iMax);
        int iMin = Integer.MIN_VALUE;
        System.out.println(iMin);

        double dMax = Double.MAX_VALUE;
        System.out.println(dMax);
        double dMin = Double.MIN_VALUE;
        System.out.println(dMin);

        long lMax = Long.MAX_VALUE;
        System.out.println(lMax);
        long lMin = Long.MIN_VALUE;
        System.out.println(lMin);

        //将字符串转换为基本数据类型的方法
        //条件：字符串必须描述了基本类型可保存的值
        String str = "3016";
        String strDouble = "2.26";
        int i = Integer.parseInt(str);
        System.out.println(i);
        double d = Double.parseDouble(str);
        System.out.println(d);

/*        int iTest = Integer.parseInt(strDouble);
        System.out.println(iTest);
        error:整形的数据类型无法储存小数
        */
        double dTest = Double.parseDouble(strDouble);
        System.out.println(dTest);

    }
}
