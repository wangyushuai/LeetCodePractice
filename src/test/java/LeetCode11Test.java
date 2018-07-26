import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangyushuai@fang.com on 2018/7/26.
 */
public class LeetCode11Test {
    private LeetCode11 leetCode11;

    @Before
    public  void setUp() throws Exception {
        leetCode11 = new LeetCode11();
    }

    @Test
    public void whenNLessThen2ThenRetrun0() throws Exception {
        int[] height = {};
        Assert.assertSame("输入空返回异常",0,leetCode11.maxArea(null));
    }

    @Test
    public void whenInputHeightThenReturnMaxArea() throws  Exception {
       int[] height = {1,1};
       int maxArea = leetCode11.maxArea(height);
       Assert.assertSame("最大值返回错误,返回值" +maxArea ,1,maxArea);
    }

}