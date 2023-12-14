package homework.day02;

/**
 * 执行程序，分析并解决问题
 * <p>
 * NumberFormatException出现的情况通常是由包装类将字符串解析为基本类型时,由于字符串内容不能正确描述基本类型导致该异常.
 * 数字    格式      异常
 *
 * @author sakai amusawa
 */
public class Test04 {
    public static void main(String[] args) {
        /*
         * 原因:
         */
        //String num = "123 ";
        String num = "123";
        int d = Integer.parseInt(num);
        System.out.println(d);

        /*
         * 原因:在该字符串"123 "中有一个空格符 该空格符导致了转变时发生了数据格式的错误，如上改正
         */
        num = "123.456";
        //d = Integer.parseInt(num);
        double a = Double.parseDouble(num);
        System.out.println(num);

        /*
         * 原因:在该字符串"123.456"中数据为double类型的数据，但是d为整形所以在转变时发生了格式错误，如上改正
         */
//		num = "123";
//		d = Integer.parseInt(num)；
//		System.out.println(d);
    }
}
