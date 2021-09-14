package complete.leetcode29;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-14
 */
public class L29Test {

    L29 l29 = new L29();

    @Test
    public void divide1() {
        int divide = l29.divide(Integer.MAX_VALUE, -1);
        Assert.assertEquals(-Integer.MAX_VALUE, divide);
    }

    @Test
    public void divide2() {
        int divide = l29.divide(Integer.MIN_VALUE, -1);
        Assert.assertEquals(Integer.MAX_VALUE, divide);
    }

    @Test
    public void divide3() {
        int divide = l29.divide(10, 3);
        Assert.assertEquals(3, divide);
    }

    @Test
    public void divide4() {
        int divide = l29.divide(7, -3);
        Assert.assertEquals(-2, divide);
    }

    @Test
    public void divide5() {
        int divide = l29.divide(-3, -3);
        Assert.assertEquals(1, divide);
    }

    @Test
    public void divide6() {
        int divide = l29.divide(Integer.MIN_VALUE, 1);
        Assert.assertEquals(Integer.MIN_VALUE, divide);
    }

    @Test
    public void divide7() {
        int divide = l29.divide(Integer.MIN_VALUE, 2);
        Assert.assertEquals(-1073741824, divide);
    }

    @Test
    public void divide8() {
        int divide = l29.divide(0, 2);
        Assert.assertEquals(0, divide);
    }

    @Test
    public void divide9() {
        int divide = l29.divide(1100540749 , -1090366779);
        Assert.assertEquals(-1, divide);
    }

}