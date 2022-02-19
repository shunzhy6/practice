package complete.leetcode70;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode70Test {

    private Leetcode70 leetcode70 = new Leetcode70();

    @Test
    public void climbStairs1() throws Exception {
        int stair = leetcode70.climbStairs(2);
        Assert.assertEquals(2, stair);
    }

    @Test
    public void climbStairs2() throws Exception {
        int stair = leetcode70.climbStairs(3);
        Assert.assertEquals(3, stair);
    }

}