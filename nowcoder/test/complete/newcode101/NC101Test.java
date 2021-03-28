package complete.newcode101;

import org.junit.Test;

public class NC101Test {

    private NC101 nc101 = new NC101();

    @Test
    public void solve() throws Exception {
        int n = nc101.solve(new int[]{0,1,2,3,4,5,7});
        // 6
        System.out.println(n);
    }

    @Test
    public void solve2() throws Exception {
        int n = nc101.solve(new int[]{0,1,2,3,4,5,7,8});
        // 6
        System.out.println(n);
    }

}