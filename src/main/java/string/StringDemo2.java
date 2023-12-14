package string;

/**
 * 字符串修改的性能问题
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s = "a";
        //开销大，运行性能差
        for (int i = 0; i < 10000000; i++) {
            s += "a";//每次拼接都会创建新的对象
        }
    }
}
