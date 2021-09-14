package complete.leetcode29;

/**
 * 29. 两数相除
 * 给定两个整数，被除数dividend和除数divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * 返回被除数dividend除以除数divisor得到的商。
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 *
 * 示例1:
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
 *
 * 示例2:
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 解释: 7/-3 = truncate(-2.33333..) = -2
 *
 * 提示：
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31, 2^31− 1]。本题中，如果除法结果溢出，则返回 2^31− 1。
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-14
 */
public class L29_1 {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == 0 || divisor == 1) {
            return dividend;
        }

        boolean negative = false;
        // 用正数可能溢出，所以使用负数来进行处理
        if (dividend > 0 && divisor > 0) {
            dividend = -dividend;
            divisor = -divisor;
        } else if (dividend > 0 && divisor < 0) {
            dividend = -dividend;
            negative = true;
        } else if (dividend < 0 && divisor > 0) {
            divisor = -divisor;
            negative = true;
        }

        int quotient = 0;
        int tempDivisor = divisor;
        int t = divide1(dividend, tempDivisor);
        if (t > 0) {
            quotient += t;
        }

        return negative ? -quotient : quotient;
    }

    public int divide1(int dividend, int divisor) {
        int quotient = 0;
        int tempDivisor = divisor;
        while (dividend <= tempDivisor) {
            if (quotient == 0) {
                quotient = 1;
            } else {
                quotient = quotient + quotient + 1;
            }
            dividend -= tempDivisor;
            if (dividend > tempDivisor) {
                break;
            }
            // 此处可能溢出
            tempDivisor += tempDivisor;
        }
        if (dividend <= divisor) {
            quotient += divide1(dividend, divisor);
        }

        return quotient;
    }

}
