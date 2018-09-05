import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangyushuai@fang.com on 2018/9/5.
 */
public class LeetCode16Test {
    private LeetCode16 service;
    @Before
    public void setUp() throws Exception {
        service = new LeetCode16();
    }

    @Test
    public void threeSumClosest() throws Exception {
        int target = 2;
        int[] arrays = {-1, 2, 1, -4};
        int actrual  = service.threeSumClosest(arrays,1);
        Assert.assertEquals(2,actrual);
    }

}