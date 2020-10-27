package com.wys.practice;

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
        KthLargest kthLargest = new KthLargest(3, new int[]{1, 2, 3, 4});
        Assert.assertEquals("com.wys.practice.LeetCode703", 3 ,kthLargest.add(5));
    }


    class KthLargest {
        PriorityQueue<Integer> queue;
        int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            this.queue = new PriorityQueue<>(k);
            for(int i = 0;i< nums.length; i++) {
                // 注意这一步是关键
                add(nums[i]);
            }
        }

        public int add(int val) {
            if (queue.size() < this.k) {
                queue.add(val);
            } else if (val > queue.peek()) {
                queue.poll();
                queue.add(val);
            }
            return queue.peek();
        }

    }


}
