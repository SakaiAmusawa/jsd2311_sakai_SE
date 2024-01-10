package reflect;

import java.io.File;
import java.net.URISyntaxException;

/**
 * 常用的相对路径
 * 1.类加载路径
 * 该路径是JVM在寻找对应的字节码文件时的起始目录
 * IDEA中:target/classes
 */
public class Demo9 {
    public static void main(String[] args) throws URISyntaxException {
/*        File dir = new File(
                Demo9.class.getClassLoader().getResource(".").toURI()
        );*/

        //当前类的字节码文件所在目录
        File dir = new File(
                Demo9.class.getResource(".").toURI()
        );
        System.out.println(dir);
    }
}
