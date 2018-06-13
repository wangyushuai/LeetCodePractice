/**
 * Created by wangyushuai@fang.com on 2018/5/10.
 */
public class LeetCode7 {

    public int reverse(int x) {
        if(x == 0) return 0;
        String intStr = "";
        int minRange = 0;
        char[] x_char = (x + "").toCharArray();
        if(x_char[0] == '-') {
            intStr += '-';
            minRange = 1;
        }
        int i = x_char[x_char.length-1] == '0' ? x_char.length -2: x_char.length - 1;
        for (; i >= minRange; i--) {
            intStr += x_char[i];
        }
        return Integer.parseInt(intStr);
    }

}
