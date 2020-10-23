import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 滑动窗口最大值
 * @author wangyushuai2@jd.com
 * @date 2020/10/22
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0) {
            return new int[0];
        }

        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0;i<nums.length;i++) {
            // 删除队列中小于窗口左边下标的元素
            if(i >= k && i - k + 1 > deque.peek()) {
                deque.remove();
            }
            // 从队列右侧开始, 删除小于nums[i] 的元素
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            }
            deque.add(i);
            // 队列左侧是最大值,加入结果
            if(i - k + 1 >= 0) {
                res[i - k + 1] = nums[deque.peek()];
            }
        }
        return res;
    }


    @Test
    public void test() {
        int[] numsParam1 = {1,3,-1,-3,5,3,6,7};
        int paramK1 = 3;
        int[] result = maxSlidingWindow(numsParam1,paramK1);
        Assert.assertTrue("LeetCode239-1：滑动窗口最大数", Arrays.equals(result,new int[]{3,3,5,5,6,7}));

        int[] numsParam2 = {1,-1};
        int paramK2 = 1;
        Assert.assertTrue("LeetCode239-2：滑动窗口最大数",
                Arrays.equals(maxSlidingWindow(numsParam2,paramK2),new int[]{1,-1}));
    }



}
