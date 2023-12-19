package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 使用文件过滤器有条件的获取一个目录的子项
 */
public class ListFileDemo2 {
    public static void main(String[] args) {
        File file = new File(".");
        if (file.isDirectory()) {
/*            FileFilter fileFilter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().startsWith(".");
                }
            };*/

            //FileFilter fileFilter = pathname->pathname.getName().startsWith(".");

            //                            lambda表达式的写法
            File[] files = file.listFiles(f -> f.getName().startsWith("."));
            for (File sub : files
            ) {
                System.out.println(sub.getName());
            }
        }
    }
}
