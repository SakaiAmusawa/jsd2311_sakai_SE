package file;

import java.io.File;

public class MakeDirDemo {
    public static void main(String[] args) {
        File dir = new File("demo");
        File dir1 = new File("zjw/demo/file");
        if (dir.exists()) {
            System.out.println("dir is exists");
        } else {
            /*
            mkdir方法创建目录，要求父目录必须存在
             */
            dir.mkdir();
            System.out.println("dir has creat");
        }

        /*
        mkdirs方法创建目录，父目录不存在自动创建
         */
        if (!dir1.exists()) {
            dir1.mkdirs();
            System.out.println("dir has creat");
        } else {
            System.out.println("dir is exists");
        }
    }
}
