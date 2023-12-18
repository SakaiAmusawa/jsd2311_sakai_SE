package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        //File file = new File("./abc/test.txt");//当前目录不存在所以报错
        if (file.exists()) {
            System.out.println(file.getName() + "已存在");
        } else {
            file.createNewFile();
            System.out.println(file.getName() + "创建完毕");
        }
    }
}
