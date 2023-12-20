package homework.day05;

import java.io.File;


/**
 * 列出当前目录中所有名字包含s的子项。
 * <p>
 * 使用匿名内部类和lambda两种写法
 * <p>
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 *
 * @author sakai amusawa
 */
public class Test02 {
    public static void main(String[] args) {
        File file = new File("./src/main/java/homework/day05/");
/*        FileFilter FileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                boolean has = pathname.getName().contains("s");
                return false;
            }
        };
        File[] files = file.listFiles(FileFilter);*/

        File[] files = file.listFiles(f -> f.getName().contains("s"));

        for (File f : files
        ) {
            System.out.println(f.getName());
        }

    }
}
