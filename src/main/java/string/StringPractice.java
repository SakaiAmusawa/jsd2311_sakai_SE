package string;

public class StringPractice {
    public static void main(String[] args) {
        String url1 = "http://www.tedu.cn";
        String url2 = "www.tarena.com.cn";
        String hostName1 = getHostName(url1);
        String hostName2 = getHostName(url2);
        System.out.println(hostName1);
        System.out.println(hostName2);
    }

    public static String getHostName(String url) {
        int indexStar = url.indexOf(".")+1;
        int indexEnd = url.indexOf(".", indexStar);
        String subUrl;
        subUrl = url.substring(indexStar , indexEnd);
        return subUrl;
    }
}
