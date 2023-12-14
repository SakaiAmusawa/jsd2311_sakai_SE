package string;

import java.util.Arrays;

/**
 * String支持的正则表达式方法二：
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        String[] strArr = str.split("[0-9]+");
        System.out.println(Arrays.toString(strArr));
        /*
        如果遇到连续地可拆分项时会生成一个空字符串""
         */
        str = "a==b=c";
        strArr = str.split("=");
        System.out.println(Arrays.toString(strArr));
        //字符串最开始就是可拆分项时，那么拆分出来的第一个就是空字符串
        str = "==a=b=c";
        strArr = str.split("=");
        System.out.println(Arrays.toString(strArr));
        //如果末尾出现可拆分项，那么可以省略
        str = "a=b=c===";
        strArr = str.split("=");
        System.out.println(Arrays.toString(strArr));
    }
}
