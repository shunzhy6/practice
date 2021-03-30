package leetcode13;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Leetcode13Test {

    @Test
    public void threeSum() throws Exception {
        Leetcode13 leetcode13 = new Leetcode13();
        List<List<Integer>> result = leetcode13.threeSum(new int[]{-1,0,1,2,-1,-4});
        //[[-1,-1,2],[-1,0,1]]
        System.out.println(result);
    }

}