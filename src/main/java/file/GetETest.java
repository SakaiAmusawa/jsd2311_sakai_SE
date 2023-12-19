package file;

import java.io.File;

public class GetETest {
    public static void main(String[] args) {
        String pathName = ".";
        File file = new File(pathName);
        if (file.isDirectory()) {
/*            FileFilter fileFilter = new FileFilter() {
                @Override
                public boolean accept(File f) {
                    //return f.getName().indexOf("e") != -1; // type1
                    return f.getName().contains("e");       //  type2
                }
            };*/
            File[] files = file.listFiles(f -> f.getName().contains("o"));

            assert files != null;
            for (File sub : files
            ) {
                System.out.println(sub.getName());
            }
        }
    }
}