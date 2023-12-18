package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("./test.txt");
        //判断文件是否存在
        if (file.exists()) {
            //存在删除
            file.delete();
            System.out.println(file.getName() + " has deleted");
        } else {
            System.out.println(file.getName() + " not exists");
        }
    }
}
