import java.util.regex.Matcher;

/**
 * Created by wangyushuai@fang.com on 2018/7/26.
 * @description Container With Most Water
 */
public class LeetCode11 {

    public int maxArea(int[] height) {
        if (height == null || height.length < 2) return 0;
        int si = 0;
        int ei = height.length -1;
        int maxArea = 0;
        while (si != ei) {
            maxArea = Math.max(maxArea,(ei-si)*Math.min(height[si],height[ei]));
            if(height[si] <= height[ei]) {
                si++;
            }else {
                ei --;
            }
        }

        return maxArea;
    }

}
