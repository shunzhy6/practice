package complete.newcode101;

/**
 *从0,1,2,...,n这n+1个数中选择n个数，组成有序数组，请找出缺失的那个数，要求O(n)尽可能小。
 * 示例1
 * 输入
 * [0,1,2,3,4,5,7]
 * 返回值
 * 6
*/
public class NC101 {

    /**
     * 找缺失数字
     * @param a int整型一维数组 给定的数字串
     * @return int整型
     */
    public int solve (int[] a) {
        return solve(a, 0, a.length);
    }

    /**
     * 找缺失数字
     * @param a int整型一维数组 给定的数字串
     * @return int整型
     */
    public int solve (int[] a, int left, int right) {
        int mid = (left + right) / 2;
        if (a[mid] > mid) {
            return mid;
        }
        if (a[mid] == mid) {
            return solve(a, mid, right);
        } else {
            return solve(a, left, mid);
        }
    }

}
