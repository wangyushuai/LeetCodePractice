import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyushuai@fang.com on 2018/4/12.
 */
public class leetCode3 {
    public static  void main(String args[]) {
        System.out.println(getLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmno"));
    }

    public static String getLongestSubstring(String s) {
        if (s.isEmpty()) {return  "0";}
        char[] chars = s.toCharArray();
        String result = chars[0] + "";
        int i = 1;
        String temp = result;
        while(i < chars.length) {
            if (result.indexOf(chars[i]) > -1) {
                if (result.length() > temp.length()) {
                    temp = result;
                }
                while (result.indexOf(chars[i]) > -1) {
                    if (result.length() > 1) {
                        result = result.substring(1);
                    } else {
                        result = "";
                    }
                }
            }
            result += chars[i];
            i++;
        }
        return temp.length() >  result.length() ? temp: result;
    }

}
