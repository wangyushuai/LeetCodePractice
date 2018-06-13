import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangyushuai@fang.com on 2018/6/13.
 */
public class LeetCode8Test {
    private LeetCode8 leetCode8;

    @Before
    public final void before() {
        leetCode8 = new LeetCode8();
    }

    @Test
    public void stringToInteger() throws Exception {
        String testStr = "42";
        Assert.assertTrue(4193 == leetCode8.stringToInteger(testStr));
    }
}
