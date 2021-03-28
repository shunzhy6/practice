package complete.newcode88;

import org.junit.Test;

public class NC88Test {

    private NC88 nc88 = new NC88();

    @Test
    public void findKth() throws Exception {
        int result = nc88.findKth(new int[]{1,3,5,2,2}, 5, 3);
        System.out.println(result);
    }

}