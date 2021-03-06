package complete.newcode119;

import org.junit.Test;

import java.util.ArrayList;

public class NC119_1Test {

    private NC119_1 nc119 = new NC119_1();

    @Test
    public void getLeastNumbers_Solution() throws Exception {
        ArrayList list = nc119.GetLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8}, 4);
        System.out.println(list.toString());
    }

    @Test
    public void getLeastNumbers_Solution2() throws Exception {
        ArrayList list = nc119.GetLeastNumbers_Solution(new int[]{2,15,4,3,9,11,5,1,6,2,7,3,8,14}, 5);
        System.out.println(list.toString());
    }

}