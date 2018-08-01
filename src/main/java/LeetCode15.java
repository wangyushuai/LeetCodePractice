import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangyushuai@fang.com on 2018/7/31.
 * 3 Sum
 */
public class LeetCode15 {
      public List<List<Integer>> threeSum(int[] nums) {
          List<List<Integer>> result = new ArrayList<List<Integer>>();
          Arrays.sort(nums);
          for(int i=0;i<nums.length -2;i ++) {
              if (i == 0 || (i >0 && nums[i] != nums[i-1] )) {
                  int lo = i  + 1, hi = nums.length - 1, sum = 0 - nums[i];
                  while (lo < hi) {
                      if (nums[lo] + nums[hi] == sum) {
                          result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                          while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                          while (lo < hi && nums[hi - 1] == nums[hi]) hi--;
                          lo++;
                          hi--;
                      } else if (nums[lo] + nums[hi] < sum) {
                          lo++;
                      } else hi--;
                  }
              }
          }
          return result;
    }

}
