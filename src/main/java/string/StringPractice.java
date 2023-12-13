package string;

public class StringPractice {
    public static void main(String[] args) {
        String url1 = "http://www.tedu.cn";
        String url2 = "www.tarena.com.cn";
        //String url3 = "https://www.bard.google.com/chat";
        String hostName1 = getHostName(url1);
        String hostName2 = getHostName(url2);
        //String hostName3 = getHostName(url3);
        System.out.println(hostName1);
        System.out.println(hostName2);
        //System.out.println(hostName3);
    }

    public static String getHostName(String url) {
        int indexStar = url.indexOf(".")+1;
        int indexEnd = url.indexOf(".", indexStar);
        return url.substring(indexStar, indexEnd);
    }
}
