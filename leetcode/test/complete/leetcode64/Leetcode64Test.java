package complete.leetcode64;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-05-09
 */
public class Leetcode64Test {

    private Leetcode64 leetcode64 = new Leetcode64();

    @Test
    public void minPathSum1() {
        int minPath = leetcode64.minPathSum(new int[][]{{1,2},{1,1}});
        Assert.assertEquals(3, minPath);
    }
}