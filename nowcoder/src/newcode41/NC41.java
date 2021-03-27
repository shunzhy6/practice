package newcode41;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个数组arr，返回arr的最长无重复子串的长度(无重复指的是所有数字都不相同)。
 *
 示例1
 输入
 [2,3,4,5]
 返回值
 4

 示例2
 输入
 [2,2,3,4,3]
 返回值
 3

 备注:
 1≤n≤10^5
 * @author zhengyingshun
 * @date 2021/3/27 16:25
 */
public class NC41 {

    /**
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>(arr.length);
        int sum = 0;
        int preRe = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int preIndex = map.get(arr[i]);

                if (preIndex < preRe) {
                    sum = i - preRe;
                    preRe = preIndex + 1;
                }
            } else {
                sum++;
                max = max > sum ? max : sum;
            }
            map.put(arr[i], i);
        }
        return max;
    }

}
