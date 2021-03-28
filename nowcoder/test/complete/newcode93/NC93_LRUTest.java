package complete.newcode93;

import org.junit.Test;

import java.util.Arrays;

public class NC93_LRUTest {

    NC93_LRU nc93_lru = new NC93_LRU();

    @Test
    public void LRU() throws Exception {
        int[] result = nc93_lru.LRU(new int[][]{{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}}, 3);
        // [1,-1]
        System.out.println(Arrays.toString(result));
    }

}