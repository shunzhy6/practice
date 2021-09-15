package complete.leetcode31;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-15
 */
public class L31Test {

    L31 l31 = new L31();

    @Test
    public void nextPermutation1() {
        int[] ints = new int[] {1, 1, 5};
        l31.nextPermutation(ints);
        Assert.assertArrayEquals(new int[] {1, 5 ,1}, ints);
    }

    @Test
    public void nextPermutation2() {
        int[] ints = new int[] {7, 6, 5};
        l31.nextPermutation(ints);
        Assert.assertArrayEquals(new int[] {5, 6, 7}, ints);
    }

    @Test
    public void nextPermutation3() {
        int[] ints = new int[] {1};
        l31.nextPermutation(ints);
        Assert.assertArrayEquals(new int[] {1}, ints);
    }

    @Test
    public void nextPermutation4() {
        int[] ints = new int[] {2, 4, 3};
        l31.nextPermutation(ints);
        Assert.assertArrayEquals(new int[] {3, 2, 4}, ints);
    }

    @Test
    public void nextPermutation5() {
        int[] ints = new int[] {2, 5, 4, 3};
        l31.nextPermutation(ints);
        Assert.assertArrayEquals(new int[] {3, 2, 4, 5}, ints);
    }

    @Test
    public void nextPermutation6() {
        int[] ints = new int[] {2, 3, 1};
        l31.nextPermutation(ints);
        Assert.assertArrayEquals(new int[] {3, 1, 2}, ints);
    }
}