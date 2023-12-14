package homework.day02;

import java.util.Objects;
import java.util.Scanner;

/**
 * 执行程序，分析并解决问题
 *
 * @author sakai amusawa
 */
class Data {
    private String path1 = "/myweb/reg";//处理注册的路径
    private String path2 = "/myweb/login";//

    public Data(String path1, String path2) {
        this.path1 = path1;
        this.path2 = path2;
    }

    public String getPath1() {
        return path1;
    }

    public void setPath1(String path1) {
        this.path1 = path1;
    }

    public String getPath2() {
        return path2;
    }

    public void setPath2(String path2) {
        this.path2 = path2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(path1, data.path1) && Objects.equals(path2, data.path2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path1, path2);
    }
}

public class Test03 {
    public static void main(String[] args) {
        //String path1 = "/myweb/reg";//处理注册的路径
        //String path2 = "/myweb/login";//处理登录的路径
        /*
         * 程序启动后，输入上述两个地址后检查下面输出.
         * 分析并解决存在的问题，并写出错误原因:
         * 在比较引用类型数据不能使用"=="，应该重写equals 在用其去比较
         *
         *
         */

        Data data = new Data("/myweb/reg", "/myweb/login");
        String path1 = data.getPath1();
        String path2 = data.getPath2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入地址:");
        String path = scanner.nextLine();
        if (path != null) {
            if (path.equals(path1)) {
                System.out.println("处理注册!");
            } else if (path.equals(path2)) {
                System.out.println("处理登录!");
            } else {
                System.out.println("输入地址有误!");
            }
        }
    }
}

