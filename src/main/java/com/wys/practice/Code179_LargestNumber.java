package com.wys.practice;

import org.junit.Test;
import java.util.*;

/**
 * 最大数
 * 给定数组重组为要给最大数
 *
 * @author wangyushuai2@jd.com
 * @date 2020/10/27
 */
public class Code179_LargestNumber {
    /**
     * 按照排序规则排序
     *
     * @param nums
     * @return
     */
    public String largestNumber(int[] nums) {
        Integer[] array  = Arrays.stream(nums).boxed().sorted(((o1, o2) -> {
            String s1 = String.valueOf(o1) + o2;
            String s2 = String.valueOf(o2) + o1;
            return s2.compareTo(s1);
        })).toArray(Integer[]::new);
        if (array[0]==0) {
            return "0";
        }
        String result = "";
        for (int i : array) {
            result += i;
        }
        return result;
    }

    @Test
    public void test() {

    }
}

