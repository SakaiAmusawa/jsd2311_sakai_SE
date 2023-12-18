package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("./test.txt");
        if (file.exists()) {
            file.delete();
            System.out.println(file.getName() + " has deleted");
        } else {
            System.out.println(file.getName() + " not exists");
        }
    }
}
