package leetcode40;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-15
 */
public class Leetcode40Test {

    Leetcode40 leetcode40 = new Leetcode40();

    @Test
    public void combinationSum21() {
        List<List<Integer>> result = leetcode40.combinationSum2(new int[] {10,1,2,7,6,1,5}, 8);
        Assert.assertEquals(Arrays.toString(result.toArray()).replace(" ", ""),
                "[[1,1,6],[1,2,5],[1,7],[2,6]]");
    }

    @Test
    public void combinationSum22() {
        List<List<Integer>> result = leetcode40.combinationSum2(new int[] {2,5,2,1,2}, 5);
        Assert.assertEquals(Arrays.toString(result.toArray()).replace(" ", ""),
                "[[1,2,2],[5]]");
    }

    @Test
    public void combinationSum23() {
        List<List<Integer>> result = leetcode40.combinationSum2(new int[] {1,2,6,2,4,4,3,5,6,7,8,8,8}, 8);
        Assert.assertEquals(Arrays.toString(result.toArray()).replace(" ", ""),
                "[[1,2,2,3],[1,2,5],[1,3,4],[1,7],[2,2,4],[2,6],[3,5],[4,4],[8]]");
    }

    @Test
    public void combinationSum24() {
        List<List<Integer>> result = leetcode40.combinationSum2(new int[] {0,0,0}, 0);
        Assert.assertEquals(Arrays.toString(result.toArray()).replace(" ", ""),
                "[[0],[0,0],[0,0,0]]");
    }

    @Test
    public void combinationSum25() {
        List<List<Integer>> result = leetcode40.combinationSum2(new int[] {1,2}, 3);
        Assert.assertEquals(Arrays.toString(result.toArray()).replace(" ", ""),
                "[[1,2]]");
    }

}