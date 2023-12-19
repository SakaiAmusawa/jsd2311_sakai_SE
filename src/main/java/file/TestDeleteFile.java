package file;

import java.io.File;

public class TestDeleteFile {
    public static void main(String[] args) {
        File file = new File("./a");
        deleteFile(file);
    }

    public static void deleteFile(File f) {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File ff : files
            ) {
                deleteFile(ff);
            }
        }
        f.delete();
    }
}
