package complete.leetcode33;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-16
 */
public class L33Test {

    L33 l33 = new L33();

    @Test
    public void search1() {
        int result = l33.search(new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4}, 3);
        Assert.assertEquals(11, result);
    }

    @Test
    public void search2() {
        int result = l33.search(new int[] {5, 6, 7, 1, 2, 3, 4}, 3);
        Assert.assertEquals(5, result);
    }

    @Test
    public void search3() {
        int result = l33.search(new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4}, 12);
        Assert.assertEquals(7, result);
    }

    @Test
    public void search4() {
        int result = l33.search(new int[] {5, 6, 7, 1, 2, 3, 4}, 6);
        Assert.assertEquals(1, result);
    }

    @Test
    public void search5() {
        int result = l33.search(new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4}, 16);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void search6() {
        int result = l33.search(new int[] {1, 2, 3, 4, 5, 6, 7}, 9);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void search7() {
        int result = l33.search(new int[] {1}, 1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void search8() {
        int result = l33.search(new int[] {1, 3}, 2);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void search9() {
        int result = l33.search(new int[] {4,5,6,7,0,1,2}, 0);
        Assert.assertEquals(4, result);
    }

    @Test
    public void search10() {
        int result = l33.search(new int[] {3, 1}, 1);
        Assert.assertEquals(1, result);
    }

}