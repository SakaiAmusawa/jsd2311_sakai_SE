package file;

import java.io.File;

public class DeleteDirDemo {

    public static void main(String[] args) {
        File dir = new File("demo");
        if (dir.exists()) {
            /*
            delete()方法可以删除File表示的文件和目录
            但是，目录必须是空的，否则无法删除
             */
            dir.delete();
            System.out.println(dir.getName() + " has deleted");
        } else {
            System.out.println(dir.getName() + " not exists");
        }
    }
}
