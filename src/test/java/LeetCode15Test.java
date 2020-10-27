import com.wys.practice.LeetCode15;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangyushuai@fang.com on 2018/8/1.
 */
public class LeetCode15Test {
    private LeetCode15 leetCode15;

    @Before
    public void setUp() throws Exception {
        leetCode15 = new LeetCode15();
    }

    @Test
    public void threeSum() throws Exception {
        int[] testNums =  {-1, 0, 1};
        List<List<Integer>> excepted = Arrays.asList(Arrays.asList(-1, 0, 1));
        Assert.assertArrayEquals(leetCode15.threeSum(testNums).toArray(),excepted.toArray());
    }

}