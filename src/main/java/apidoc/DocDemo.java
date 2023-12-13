package apidoc;

/**
 * @author sakai
 * @version 1.0
 * @see java.lang.String
 * @since JDK1.8
 */
public class DocDemo {
    /**
     * sayHello方法中的问候语
     */
    public static final String INFO = "你好";

    /**
     * 为给定的用户添加问候语          说明方法的功能描述
     *
     * @param name 给定的用户的名字 说明参数“name”的作用
     * @return 放回含有问候语的字符串 说明返回值
     */
    public String sayHello(String name) {
        return INFO + name;
    }
}
