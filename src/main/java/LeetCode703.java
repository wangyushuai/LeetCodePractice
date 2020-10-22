import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * 数据流中的第K大元素
 * @author wangyushuai2@jd.com
 * @date 2020/10/19
 */
public class LeetCode703 {


    @Test
    public void test() {

    }




    class KthLargest {
        int[] result= {};
        int k;
        public KthLargest(int k, int[] nums) {
            this.k = k;
            Arrays.sort(nums);
            result = k > nums.length ? nums : Arrays.copyOfRange(nums,nums.length -k,nums.length);
        }

        public int add(int val) {
            if(result.length < k) {
                int[] copy = Arrays.copyOf(result,result.length+1);
                copy[result.length] = val;
                result = copy;
            }
            if (val < result[0]) {
                result[0] = val;
                Arrays.sort(result);
            }
            return result[0];
        }
    }


}
