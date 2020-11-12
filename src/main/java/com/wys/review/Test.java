package com.wys.review;

import org.junit.Assert;

/**
 * 编程题：
 * 输入：一个数字形式的字符串
 * 输出：一个计算后的整型数
 * 输入样例：
 * "123" ， "-123"， "21474836970"，  "-21474836970”
 * 输出样例：
 * 123 ，-123 ， 2147483647， -2147483648
 * 异常：
 * 返回0
 *
 * @author wangyushuai2@jd.com
 * @date 2020/11/5
 */
public class Test {

    public Integer convertStringToInt(String str) {
        Integer result;
        try {
            result =  Integer.valueOf(str);
        } catch (Exception ex) {
            return 0;
        }
        return result;
    }

    @org.junit.Test
    public void test() {
        Assert.assertTrue("字符串转整形",123 == convertStringToInt("123"));
        Assert.assertTrue("字符串转整形",2147483647 == convertStringToInt("-21474836970"));
    }


}
