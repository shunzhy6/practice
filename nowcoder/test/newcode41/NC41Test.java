package newcode41;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NC41Test {

    private NC41 nc41 = new NC41();

    @Test
    public void maxLength1() throws Exception {
        int max = nc41.maxLength(new int[]{2, 3, 4, 5});
        Assert.assertEquals(max, 4);
    }

    @Test
    public void maxLength2() throws Exception {
        int max = nc41.maxLength(new int[]{2,2,3,4,3});
        Assert.assertEquals(max, 3);
    }

    @Test
    public void maxLength3() throws Exception {
        int max = nc41.maxLength(new int[]{2,2,3,4,3,1,4,5,6,7,8,9,5});
        Assert.assertEquals(max, 8);
    }

    @Test
    public void maxLength4() throws Exception {
        int max = nc41.maxLength(new int[]{2,2,3,4,3,1,4,5,6,7,1,9,4});
        Assert.assertEquals(max, 6);
    }

    @Test
    public void maxLength5() throws Exception {
        int max = nc41.maxLength(new int[]{6,4,1,2,3,1,2,3,4,5});
        Assert.assertEquals(max, 5);
    }

    @Test
    public void maxLength6() throws Exception {
        int max = nc41.maxLength(new int[]{1,4,1,2,3,1,2,3,4,5});
        Assert.assertEquals(max, 5);
    }

}