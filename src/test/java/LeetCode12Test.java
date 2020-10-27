import com.wys.practice.LeetCode12;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by wangyushuai@fang.com on 2018/7/27.
 */
public class LeetCode12Test {
    private LeetCode12 leetCode12;

    @Before
    public void setUp() throws Exception {
        leetCode12 = new LeetCode12();
    }

    @Ignore
    @Test
    public void intToRoman() throws Exception {
        Assert.assertTrue("change test","III" == leetCode12.intToRoman(3));
        Assert.assertTrue("change test","IV" ==leetCode12.intToRoman(4));
        Assert.assertTrue("change test","LVIII" == leetCode12.intToRoman(58));
        Assert.assertTrue("change test","MCMXCIV" == leetCode12.intToRoman(1994));
    }

    @Test
    public void whenInputOutRangeThenRetrun0() {
        String result = leetCode12.intToRoman(-1);
        Assert.assertSame("input exception test","",result);
    }



}