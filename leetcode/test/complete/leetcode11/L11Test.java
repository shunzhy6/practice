package complete.leetcode11;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-06
 */
public class L11Test {

    L11 l11 = new L11();

    @Test
    public void maxArea1() {
        int result = l11.maxArea(new int[] {1,8,6,2,5,4,8,3,7});
        Assert.assertEquals(result, 49);
    }

    @Test
    public void maxArea2() {
        int result = l11.maxArea(new int[] {1,1});
        Assert.assertEquals(result, 1);
    }

    @Test
    public void maxArea3() {
        int result = l11.maxArea(new int[] {4,3,2,1,4});
        Assert.assertEquals(result, 16);
    }

    @Test
    public void maxArea4() {
        int result = l11.maxArea(new int[] {1,2,1});
        Assert.assertEquals(result, 2);
    }

}