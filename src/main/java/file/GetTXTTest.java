package file;

import java.io.File;

public class GetTXTTest {
    public static void main(String[] args) {
        File file = new File(".");
        if (file.isDirectory()) {
            File[] files = file.listFiles(f -> f.getName().endsWith(".txt"));

            for (File sub : files
            ) {
                System.out.println(sub.getName());
            }
        }
    }
}
