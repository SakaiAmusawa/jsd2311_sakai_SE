package file;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        /*
        要用相对路径而不是绝对路径
         */
        File file = new File("./demo.txt");

        //获取文件名
        String name = file.getName();
        System.out.println("文件名：" + name);

        //获取文件长度(用long接受数据)
        long fileLength = file.length();
        System.out.println("长度：" + fileLength);


        boolean cr = file.canRead();
        boolean cw = file.canWrite();
        boolean ih = file.isHidden();
        System.out.println("can read:" + cr);
        System.out.println("can write:" + cw);
        System.out.println("is hidden:" + ih);
    }
}
