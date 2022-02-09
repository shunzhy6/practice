package complete.leetcode34;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-09
 */
public class L34Test {

    L34 l34 = new L34();

    @Test
    public void searchRange1() {
        int[] result = l34.searchRange(new int[]{5,7,7,8,8,10}, 8);
        Assert.assertArrayEquals(result, new int[] {3, 4});
    }

    @Test
    public void searchRange2() {
        int[] result = l34.searchRange(new int[]{5,7,7,8,8,10}, 6);
        Assert.assertArrayEquals(result, new int[] {-1, -1});
    }

    @Test
    public void searchRange3() {
        int[] result = l34.searchRange(new int[]{}, 0);
        Assert.assertArrayEquals(result, new int[] {-1, -1});
    }

    @Test
    public void searchRange4() {
        int[] result = l34.searchRange(new int[]{1,3}, 1);
        Assert.assertArrayEquals(result, new int[] {0, 0});
    }

    @Test
    public void searchRange5() {
        int[] result = l34.searchRange(new int[]{1,2,3,3,3,3,4,5,9}, 3);
        Assert.assertArrayEquals(result, new int[] {2, 5});
    }

}