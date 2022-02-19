package complete.leetcode46;

import org.junit.Test;

import java.util.List;

public class Leetcode46Test {

    private Leetcode46_1 leetcode46 = new Leetcode46_1();

    @Test
    public void permute1() throws Exception {
        List<List<Integer>> result = leetcode46.permute(new int[]{1,2,3});
        System.out.println(result);
    }

    @Test
    public void permute2() throws Exception {
        List<List<Integer>> result = leetcode46.permute(new int[]{1,2,3,5,6,8});
        System.out.println(result);
    }

}