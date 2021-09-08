package complete.leetcode16;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-08
 */
public class L16Test {

    L16 l16 = new L16();

    @Test
    public void threeSumClosest1() {
        int closest = l16.threeSumClosest(new int[] {-1,2,1,-4}, 1);
        Assert.assertEquals(2, closest);
    }
}