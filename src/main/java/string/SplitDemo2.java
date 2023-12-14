package string;

import java.util.Arrays;

public class SplitDemo2 {
    public static void main(String[] args) {
        String str = "a=b=c=d===";
        String[] strArr = str.split("=");
        System.out.println(Arrays.toString(strArr));

        strArr = str.split("=", 2);
        System.out.println(Arrays.toString(strArr));

        //如果可拆分项不足限定拆分项时，数组为最多可拆分项
        strArr = str.split("=", 10);
        System.out.println(Arrays.toString(strArr));


        //当limit小于零时，能拆的都拆
        strArr = str.split("=", -1);
        System.out.println(Arrays.toString(strArr));
    }
}
