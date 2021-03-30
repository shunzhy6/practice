package newcode61;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NC61Test {

    private NC61 nc61 = new NC61();

    @Test
    public void twoSum() throws Exception {
        int[] result = nc61.twoSum(new int[]{20, 70, 110, 150}, 90);
        Assert.assertEquals("[0, 0]", Arrays.toString(result));
    }

}