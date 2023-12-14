package string;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String url = "ie=utf-8&f=3&rsv_bp=1&rsv_idx=1&tn=baidu&wd=%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F&fenlei=256&rsv_pq=0xb9ce72620000014c&rsv_t=577dllADtBpnvd9xums3sF3ZZvcl%2BMNelA3S3NEZLZb%2B%2FFFtPbA7bXdW6Lj7&rqlang=en&rsv_enter=1&rsv_dl=ih_1&rsv_sug3=1&rsv_sug1=1&rsv_sug7=001&rsv_sug2=1&rsv_btype=i&rsp=1&rsv_sug9=es_2_1&rsv_sug4=2477&rsv_sug=9";
        String[] urlArray = url.split("&");
        System.out.println(Arrays.toString(urlArray));
    }
}
