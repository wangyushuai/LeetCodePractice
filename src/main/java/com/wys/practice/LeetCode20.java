package com.wys.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效括号
 * @author wangyushuai2@jd.com
 * @date 2020/10/15
 */
public class LeetCode20 {

    public boolean isValid(String s) {
        Stack stack = new Stack();
        Map<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for (char c : s.toCharArray()) {
            if (! map.containsKey(c)) {
                stack.push(c);
            } else if(stack.isEmpty() || !map.get(c).equals(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    @Test
    public void testResult() {
        String str = "{[]}";
        Assert.assertTrue("有效括号",isValid(str));
    }


}
