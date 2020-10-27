import com.wys.practice.LeetCode8;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
//        Assert.assertTrue(4193 == leetCode8.stringToInteger(testStr));
    }

    @Test
    public void myAtoiTest() throws Exception {
         int except = 0;
         int value = leetCode8.myAtoi("words and 987");
         Assert.assertTrue(except == value );
         int value1 = leetCode8.myAtoi("-91283472332");
         Assert.assertTrue("整数最大最小值测试失败 expect:-2147483648, actrullay:" + value1,-2147483648 == value1);
         //Assert.assertTrue("010TestError",0 == leetCode8.myAtoi("010"));
         Assert.assertTrue("符号位测试", 1 == leetCode8.myAtoi("+1"));
         Assert.assertTrue("0-1测试失败", 0 == leetCode8.myAtoi("0-1"));
    }







}
