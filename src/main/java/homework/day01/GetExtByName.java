package homework;

/**
 * 实现方法,完成获取下列文件名中的后缀名
 *
 * @author Sakai amusawa
 * <p>
 * 单词记一记:
 * file   文件
 * name   名字           --->       fileName 文件名
 * <p>
 * ext 这里是单词extension的前三个字母，这里指"后缀"的意思。
 * 注:开发中当一个单词作为标识符命名比较长时，可以用类似方式简写
 * <p>
 * get 获取，获得
 * <p>
 * getExtByName 表示获取后缀根据名字
 * <p>
 * logo 商标，徽标
 */
public class GetExtByName {

    public static void main(String[] args) {
        String fileName01 = "下载.jpg";
        String fileName02 = "Hello.js.7z";
        String ext1 = getExtByName(fileName01);
        String ext2 = getExtByName(fileName02);
        System.out.println(ext1);
        System.out.println(ext2);

    }

    public static String getExtByName(String fileName) {
        int index = fileName.lastIndexOf(".") + 1;
        return fileName.substring(index);
    }
}
