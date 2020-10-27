package com.wys.practice;

import java.util.*;

/**
 * 有效字符异位词
 * @author wangyushuai2@jd.com
 * @date 2020/10/22
 */
public class LeetCode242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return  Arrays.equals(sChars,tChars);
    }
}
