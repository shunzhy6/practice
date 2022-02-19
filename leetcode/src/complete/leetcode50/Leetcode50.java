package complete.leetcode50;

/**
 * 50. Pow(x, n)
 * 实现pow(x, n)，即计算 x 的 n 次幂函数（即，xn ）。
 *
 * 示例 1：
 * 输入：x = 2.00000, n = 10
 * 输出：1024.00000
 *
 * 示例 2：
 * 输入：x = 2.10000, n = 3
 * 输出：9.26100
 *
 * 示例 3：
 * 输入：x = 2.00000, n = -2
 * 输出：0.25000
 * 解释：2-2 = 1/22 = 1/4 = 0.25
 *
 * 提示：
 * -100.0 < x < 100.0
 * -231 <= n <= 231-1
 * -104 <= xn <= 104
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-16
 */
public class Leetcode50 {

    public double myPow(double x, int n) {
        boolean flag = n < 0;
        boolean minFlag = false;
        if (n == Integer.MIN_VALUE) {
            n++;
            minFlag = true;
        }
        double result = positiveMyPow(x, Math.abs(n));

        if (minFlag) {
            result *= x;
        }
        if (flag) {
            return 1 / result;
        }

        return result;
    }

    public double positiveMyPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }

        double result = myPow(x, n / 2);
        return n % 2 == 1 ? result * x : result;
    }

}
