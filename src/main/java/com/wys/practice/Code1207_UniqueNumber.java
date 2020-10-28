package com.wys.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 独一无二的出现次数
 * @author wangyushuai2@jd.com
 * @date 2020/10/28
 */
public class Code1207_UniqueNumber {

    public boolean uniqueOccurrences(int[] arr) {
        if (arr== null || arr.length ==0) {
            return true;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0) +1);
        }
        Set<Integer> set =  new HashSet<>(map.values());
        return set.size()== map.size();
    }

    @Test
    public void test() {
        int[] array = {1,2,2,1,1,3};
        Assert.assertEquals("独一无二出现次数",true,uniqueOccurrences(array));
    }
}
