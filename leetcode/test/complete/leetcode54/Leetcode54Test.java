package complete.leetcode54;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-19
 */
public class Leetcode54Test {

    Leetcode54 leetcode54 = new Leetcode54();

    @Test
    public void spiralOrder1() {
        List<Integer> result = leetcode54.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        Assert.assertArrayEquals(new Integer[] {1,2,3,6,9,8,7,4,5}, result.toArray());
    }

    @Test
    public void spiralOrder2() {
        List<Integer> result = leetcode54.spiralOrder(new int[][]{{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10,11,12},
                {13,14,15,16,17,18}});
        Assert.assertArrayEquals(new Integer[] {1,2,3,4,5,6,12,18,17,16,15,14,13,7,8,9,10,11}, result.toArray());
    }

    @Test
    public void spiralOrder3() {
        List<Integer> result = leetcode54.spiralOrder(new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}});
        Assert.assertArrayEquals(new Integer[] {1,2,3,4,8,12,11,10,9,5,6,7}, result.toArray());
    }

    @Test
    public void spiralOrder4() {
        List<Integer> result = leetcode54.spiralOrder(new int[][]{{1,2,3}});
        Assert.assertArrayEquals(new Integer[] {1,2,3}, result.toArray());
    }


    @Test
    public void spiralOrder5() {
        List<Integer> result = leetcode54.spiralOrder(new int[][]{{1},{2},{3}});
        Assert.assertArrayEquals(new Integer[] {1,2,3}, result.toArray());
    }

}