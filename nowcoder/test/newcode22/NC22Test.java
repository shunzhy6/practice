package newcode22;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NC22Test {

    NC22 nc22 = new NC22();

    @Test
    public void merge() throws Exception {
        int[] A = new int[] {1, 3, 5, 6, 9, 22, 34, 44, 56, 88, 0, 0, 0, 0, 0};
        int[] B = new int[] {9, 11, 33, 44, 99};
        nc22.merge(A, 10, B, 5);
        System.out.println(Arrays.toString(A));
    }

}