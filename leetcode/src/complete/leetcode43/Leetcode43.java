package complete.leetcode43;

import java.util.ArrayList;
import java.util.List;

/**
 * 43. 字符串相乘
 * 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
 * 注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。
 *
 * 示例 1:
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 *
 * 示例2:
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 *
 * 提示：
 * 1 <= num1.length, num2.length <= 200
 * num1和 num2只能由数字组成。
 * num1和 num2都不包含任何前导零，除了数字0本身。
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-15
 */
public class Leetcode43 {

    public String multiply(String num1, String num2) {
        List<Integer> list = new ArrayList<>();
        list.add(0);

        for (int j = num2.length() - 1; j >= 0; j--) {
            int t = num2.length() - j - 1;

            int jin = 0;
            for (int i = num1.length() - 1; i >= 0; i--) {
                int m = (num2.charAt(j) - '0') * (num1.charAt(i) - '0') + jin;

                if (t < list.size()) {
                    m += list.get(t);
                }

                if (m > 9) {
                    jin = m / 10;
                    m = m % 10;
                } else {
                    jin = 0;
                }

                if (t < list.size()) {
                    list.set(t, m);
                } else {
                    list.add(m);
                }
                t++;
            }

            while (jin > 0) {
                list.add(jin % 10);
                jin = jin / 10;
            }

        }

        StringBuilder result = new StringBuilder();
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == 0) {
                list.remove(i);
            } else {
                break;
            }
        }
        list.forEach(result::append);

        return result.reverse().toString();
    }

}
