package com.wys.practice.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 删除排序数组中的重复项
 * 与移动零问题相似
 * - 如数组是非有序的， 则需要遍历两遍， 复杂度O(n^2)
 * - 因为数组是有序的， 只需要与前一个数进行比较，如大于前一个元素，直接替换J元素
 *
 * @author wangyushuai2@jd.com
 * @date 2020/12/21
 */
public class LeetCode26_RemoveDumplicates {

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] > nums[i-1]) {
                nums[j] = nums[i];
                j ++;
            }
        }
        return j;
    }

    @Test
    public void test() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] excepted = {0,1,2,3,4};
        Assert.assertEquals("去除重复元素",excepted.length,removeDuplicates(nums));
    }
}
