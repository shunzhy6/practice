package leetcode46;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Leetcode46Test {

    private Leetcode46 leetcode46 = new Leetcode46();

    @Test
    public void permute() throws Exception {
        List<List<Integer>> result = leetcode46.permute(new int[]{1,2,3});
        System.out.println(result);
    }

}