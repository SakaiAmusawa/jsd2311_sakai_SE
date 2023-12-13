package homework;


import java.util.Random;
import java.util.Scanner;

/**
 * 这是一个简易的生成验证码的程序
 * <p>
 * 通过修改codeLibrary 可以更改验证码随机的获取范围
 * <p>
 * 通过修改for循环中的条件来控制验证码的位数
 *
 * @author sakai amusawa
 */
public class VerificationCode {
    public static void main(String[] args) {
        String codeLibrary = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        Random random = new Random();
        //从随机码库中随机抽取4个字符生成随机验证吗
        String code = "";
        for (int i = 0; i < 4; i++) {
            int bound = random.nextInt(codeLibrary.length() - 1);
            char c = codeLibrary.charAt(bound);
            code += c;
        }
        System.out.println(code);
        //获取用户输入的验证码
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input verificationCode:");
        //将验证码和用户输入的都转换为小写
        code = code.toLowerCase();
        String inPutCode = scanner.nextLine().toLowerCase();
        //判断用户输入的代码与生成的代码是否一致
        while (true) {
            if (inPutCode.equals(code)) {
                System.out.println("true code");
                break;
            } else {
                System.out.println("error,input again:");
                inPutCode = scanner.nextLine().toLowerCase();
            }
        }
    }
}
