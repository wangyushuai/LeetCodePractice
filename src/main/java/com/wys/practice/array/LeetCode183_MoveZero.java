package com.wys.practice.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * 移动零
 * @author wangyushuai2@jd.com
 * @date 2020/12/21
 */
public class LeetCode183_MoveZero {

    /**
     * 移动零
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                // 重要步骤
                if (i != j) {
                    nums[i] = 0;
                }
                j ++;
            }
        }
    }

    @Test
    public void test() {
        int[] nums = {0,1,0,3,12};
        int[] excepted = {1,3,12,0,0};
        moveZeroes(nums);
        Assert.assertTrue("移动零",Arrays.equals(nums,excepted));
        //Assert.assertEquals("移动零",nums,excepted);
    }
}
