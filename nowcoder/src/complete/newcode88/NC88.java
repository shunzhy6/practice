package complete.newcode88;

/**
 *有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
 *
 * 给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
 *
 * 示例1
 * 输入
 * [1,3,5,2,2],5,3
 * 返回值
 * 2
*/
public class NC88 {

    public int findKth(int[] a, int n, int K) {
        // write code here
        return this.quickSort(a, 0, n - 1, K);
    }

    private int quickSort(int[] a, int left, int right, int K) {
        if (left >= right) {
            return a[left];
        }
        int position = this.position(a, left, right);
        if (position + 1 == K) {
            return a[position];
        }
        if (position + 1 > K) {
            return this.quickSort(a, left, position - 1, K);
        } else {
            return this.quickSort(a, position + 1, right, K);
        }
    }

    private int position(int[] a, int left, int right) {
        int tmp = a[left];
        while (left < right) {
            while (left < right && a[right] >= tmp) {
                right--;
            }
            if (left < right) {
                a[left++] = a[right];
            }
            while (left < right && a[left] < tmp) {
                left++;
            }
            if (left < right) {
                a[right--] = a[left];
            }
        }
        a[left] = tmp;

        return left;
    }

}
