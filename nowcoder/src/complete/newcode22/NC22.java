package complete.newcode22;

/**
 *给出两个有序的整数数组 A和 B，请将数组 B合并到数组 A中，变成一个有序的数组
 * 注意：
 * 可以假设A 数组有足够的空间存放B 数组的元素， A和 B中初始的元素数目分别为 m和 n
*/
public class NC22 {

    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        int t = m + n - 1;
        while (j >= 0 && i >= 0) {
            if (A[i] > B[j]) {
                A[t] = A[i];
                i--;
            } else {
                A[t] = B[j];
                j--;
            }
            t--;
        }

        while (j >= 0) {
            A[t] = B[j];
            j--;
            t--;
        }
    }

}
