package complete.leetcode18;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-09
 */
public class L18Test {

    L18 l18 = new L18();

    @Test
    public void fourSum1() {
        List<List<Integer>> result = l18.fourSum(new int[] {1,0,-1,0,-2,2}, 0);
        Assert.assertEquals("[[1,2,-1,-2],[0,2,0,-2],[0,1,0,-1]]", result.toString().replace(" ", ""));
    }

    @Test
    public void fourSum2() {
        List<List<Integer>> result = l18.fourSum(new int[] {2,2,2,2,2}, 8);
        Assert.assertEquals("[[2,2,2,2]]", result.toString().replace(" ", ""));
    }

    @Test
    public void fourSum3() {
        List<List<Integer>> result = l18.fourSum(new int[] {0,0,0,0}, 0);
        Assert.assertEquals("[[0,0,0,0]]", result.toString().replace(" ", ""));
    }


}