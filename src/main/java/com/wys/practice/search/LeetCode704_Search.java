package com.wys.practice.search;

import org.junit.Assert;
import org.junit.Test;

/**
 * 二分查找
 * @author wangyushuai2@jd.com
 * @date 2020/11/3
 */
public class LeetCode704_Search {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while (left < right) {
            int pivot = (right + left)/2;
            if (target == nums[pivot]) {
                return pivot;
            }
            if (target > nums[pivot]) {
                left = pivot +1;
            } else {
                right = pivot -1;
            }
        }
        return -1;
    }

    @Test
    public void test() {
        int[] arr = {-1,0,3,5,9,12};
        int i = search(arr,3);
        int j = search(arr,9);
        int k = search(arr,20);
        Assert.assertEquals("二分查找-1",2,i);
        Assert.assertEquals("二分查找-2",4,j);
        Assert.assertEquals("二分查找-3",-1,k);
    }


}
