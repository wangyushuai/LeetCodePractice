import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangyushuai@fang.com on 2018/7/30.
 */
public class LeetCode13Test {
    private LeetCode13 leetCode13;

    @Before
    public void setUp() throws Exception {
        leetCode13 = new LeetCode13();
    }

    @Test
    public void romanToInt() throws Exception {
        String romanStr = "III";
        Assert.assertEquals("转换测试1",3,leetCode13.romanToInt(romanStr));
        Assert.assertEquals("转换测试2",1994,leetCode13.romanToInt("MCMXCIV"));
    }

}