import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wangyushuai@fang.com on 2018/6/11.
 * Implement atoi which converts a string to an integer.
 */
public class LeetCode8 {
    public  int stringToInteger(String str) {
        String resultStr = "";
        int result = 0;
        long tempReulst = 0;

        String regex = "(\\s*)(-?)(\\d*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            resultStr = matcher.group();
        }

        //check
        try {
            result = Long.parseLong(resultStr) > Integer.MAX_VALUE ?Integer.MAX_VALUE : Integer.parseInt(resultStr);
        } catch(Exception ex) {
            result = 0;
        }
        return result;
    }

    /**
     * 字符串转数字
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        boolean isStart = false;
        boolean isHaveSign = false;
        int sign = 1;
        long result = 0;

        for (char c : chars) {
            if (c == ' ' && !isStart) {
                continue;
            } else if ( (c == '-'|| c== '+') && !isHaveSign && !isStart) {
                isHaveSign = true;
                isStart = true;
                sign = c== '-'? -1 : 1;
                continue;
            } else if ( (c >= '0' && c <= '9') || (c == '0' && isStart)) {
                long temp =  result * 10 + c -'0';
                if (sign * temp > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if(sign * temp < Integer.MIN_VALUE) {
                    return  Integer.MIN_VALUE;
                } else {
                    result = result * 10 + c -'0';
                }
                isStart = true;

            }else if(c != ' ' && (c < '0' || c > '9')  && !isStart ) {
                return 0;
            }else if (!isStart) {
                continue;
            } else {
                break;
            }
        }
        return (int)(result*sign);
    }

}
