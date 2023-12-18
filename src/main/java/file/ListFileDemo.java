package file;

import java.io.File;

public class ListFileDemo {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()) {
            File[] dirs = dir.listFiles();
            for (File s : dirs
            ) {
                System.out.println(s.getName());
            }
        }
    }
}
