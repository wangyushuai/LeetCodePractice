package com.wys.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by wangyushuai@fang.com on 2018/9/5.
 */
public class LeetCode16 {
    public int threeSumClosest(int[] nums,int target) {
        int result = nums[0] + nums[1] + nums[nums.length -1];
        Arrays.sort(nums);
        for (int i = 0;i<nums.length;i++) {
            int start = i + 1,end = nums.length - 1;
            while(start <  end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > target) {
                    end --;
                }else {
                    start ++;
                }
                if (Math.abs(sum-target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
