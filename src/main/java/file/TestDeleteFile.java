package file;

import java.io.File;

public class TestDeleteFile {
    public static void main(String[] args) {
        File file = new File("./a");
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                String name = files[i].getName();
                System.out.println(name);
                files[i].delete();
            }
        }
    }
}
