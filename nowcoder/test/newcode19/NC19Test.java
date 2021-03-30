package newcode19;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NC19Test {

    private NC19 nc19 = new NC19();

    @Test
    public void maxsumofSubarray() throws Exception {
        int max = nc19.maxsumofSubarray(new int[]{1, -2, 3, 5, -2, 6, -1});
        Assert.assertEquals(12, max);
    }

}