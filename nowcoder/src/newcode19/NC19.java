package newcode19;

/**
 * 给定一个数组arr，返回子数组的最大累加和
 * 例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
 * 题目保证没有全为负数的数据
 * [要求]
 * 时间复杂度为O(n)，空间复杂度为O(1)
 *
 * 示例1
 * 输入
 * [1, -2, 3, 5, -2, 6, -1]
 * 返回值
 * 12
 *
 * 备注:
 * 1≤N≤10^5
 * arr[i]≤100
 * @author zhengyingshun
 * @date 2021/3/28 19:48
 */
public class NC19 {

    /**
     * TODO 动态规划与分治法
     * max sum of the subarray
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxsumofSubarray (int[] arr) {
        int max = 0;

        int sum = 0;
        for (int i : arr) {
            int t = sum + i;
            if (t >= 0) {
                max = Math.max(max, t);
                sum = t;
            } else {
                sum = 0;
            }
        }

        return max;
    }

}
