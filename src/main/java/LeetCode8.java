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

}
