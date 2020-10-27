import com.wys.practice.LeetCode10;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangyushuai@fang.com on 2018/7/13.
 */
public class LeetCode10Test {
    private LeetCode10 leetCode10;
    @Before
    public void setUp() throws Exception {
        leetCode10 = new LeetCode10();
    }

    @Test
    public void isMatch() throws Exception {
        String str1 = "aab";
        String p1 = "c*a*b";
        boolean isTrue1 = leetCode10.isMatch(str1,p1);
        Assert.assertTrue(isTrue1);
    }
}