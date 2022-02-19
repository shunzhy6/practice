package leetcode39;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-14
 */
public class Leetcode39Test {

    Leetcode39 leetcode39 = new Leetcode39();

    @Test
    public void combinationSum1() {
        List<List<Integer>> result = leetcode39.combinationSum(new int[] {2,3,6,7}, 7);
        Assert.assertEquals(Arrays.toString(result.toArray()), "[[2, 2, 3], [7]]");
    }

    @Test
    public void combinationSum2() {
        List<List<Integer>> result = leetcode39.combinationSum(new int[] {2,3,5}, 8);
        Assert.assertEquals(Arrays.toString(result.toArray()).replace(" ", ""),
                "[[2,2,2,2],[2,3,3],[3,5]]");
    }

    @Test
    public void combinationSum3() {
        List<List<Integer>> result = leetcode39.combinationSum(new int[] {2}, 1);
        Assert.assertArrayEquals(result.toArray(), new Integer[][]{});
    }

    @Test
    public void combinationSum4() {
        List<List<Integer>> result = leetcode39.combinationSum(new int[] {1,2}, 2);
        Assert.assertEquals(Arrays.toString(result.toArray()).replace(" ", ""),
                "[[1,1],[2]]");
    }

    @Test
    public void combinationSum5() {
        List<List<Integer>> result = leetcode39.combinationSum(new int[] {1,2,3,5,6,7,8}, 8);
        Assert.assertEquals(Arrays.toString(result.toArray()).replace(" ", ""),
                "[[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,2],[1,1,1,1,1,3],[1,1,1,1,2,2],[1,1,1,2,3]"
                        + ",[1,1,1,5],[1,1,2,2,2],[1,1,3,3],[1,1,6],[1,2,2,3],[1,2,5],[1,7],"
                        + "[2,2,2,2],[2,3,3],[2,6],[3,5],[8]]");
    }

    @Test
    public void combinationSum6() {
        List<List<Integer>> result = leetcode39.combinationSum(new int[] {7,3}, 17);
        Assert.assertEquals(Arrays.toString(result.toArray()).replace(" ", ""),
                "[[3,7,7]]");}

}