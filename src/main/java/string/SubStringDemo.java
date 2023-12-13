package string;

public class SubStringDemo {
    public static void main(String[] args) {
        //             012345678901
        String name = "sakaiAmusawa";
        String subString = name.substring(0, 5);//含头不含尾   数学表达为：[0,5)
        System.out.println(subString);

        subString = name.substring(5);//从开始下标截取到最后
        System.out.println(subString);
    }
}
