package com.wys.practice;

import java.util.HashMap;

/**
 * Created by wangyushuai@fang.com on 2018/7/30.
 * Roman to Integer
 */
public class LeetCode13 {

    public int romanToInt(String s) {
        int result = 0;
        HashMap hashMap = new HashMap<String,Integer>() {
            {
                put("I",1);
                put("V",5);
                put("X",10);
                put("L",50);
                put("C",100);
                put("D",500);
                put("M",1000);
            };
        };
        char[] romanItems = s.toCharArray();
        int preNum = 0;
        for (char item : romanItems) {
           int curNum = (int) hashMap.get(item + "");
           if (curNum > preNum) {
               result += curNum - 2 * preNum;
           } else {
               result += curNum;
           }
           preNum = curNum;
        }
        return result;
    }

}
