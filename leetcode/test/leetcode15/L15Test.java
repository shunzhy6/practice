package leetcode15;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-07
 */
public class L15Test {

    L15 l15 = new L15();

    @Test
    public void threeSum1() {
        List<List<Integer>> result = l15.threeSum(new int[] {-1,0,1,2,-1,-4});
        Assert.assertEquals("[[-1,-1,2],[-1,0,1]]", result.toString().replace(" ", ""));
    }

    @Test
    public void threeSum2() {
        List<List<Integer>> result = l15.threeSum(new int[] {});
        Assert.assertEquals("[]", result.toString());
    }

    @Test
    public void threeSum3() {
        List<List<Integer>> result = l15.threeSum(new int[] {0});
        Assert.assertEquals("[]", result.toString());
    }

    @Test
    public void threeSum4() {
        List<List<Integer>> result = l15.threeSum(new int[] {0, 0});
        Assert.assertEquals("[]", result.toString());
    }

    @Test
    public void threeSum5() {
        List<List<Integer>> result = l15.threeSum(new int[] {0, 0, 0});
        Assert.assertEquals("[[0,0,0]]", result.toString().replace(" ", ""));
    }

    @Test
    public void threeSum6() {
        List<List<Integer>> result = l15.threeSum(new int[] {0, 0, 0, 0});
        Assert.assertEquals("[[0,0,0]]", result.toString().replace(" ", ""));
    }

    @Test
    public void threeSum7() {
        List<List<Integer>> result = l15.threeSum(new int[] {-2,0,1,1,2});
        Assert.assertEquals("[[-2,0,2],[-2,1,1]]", result.toString().replace(" ", ""));
    }

    @Test
    public void threeSum8() {
        List<List<Integer>> result = l15.threeSum(new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4});
        Assert.assertEquals("[[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]]", result.toString().replace(" ", ""));
    }

}