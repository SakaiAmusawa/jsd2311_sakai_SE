package string;

/**
 * toUpperCase();转换为大写
 * toLowerCase();转换为小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String name = "SakaiAmusawa";

        String low = name.toLowerCase();
        System.out.println(low);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String codeOut = "SDFSsdfsd";
        String codeIn = "SdfsSdFsd";

        boolean equals = codeIn.equals(codeOut);
        System.out.println(equals);

        codeOut = codeOut.toLowerCase();
        codeIn = codeIn.toLowerCase();
        equals = codeIn.equals(codeOut);
        System.out.println(equals);

        equals = codeIn.equalsIgnoreCase(codeOut);//该方法提供了忽略大小写的比较方式
        System.out.println(equals);
    }
}
