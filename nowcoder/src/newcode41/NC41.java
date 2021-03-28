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
        int sum = 0; //目前的无重复子串长度
        int startIndex = 0; //当前无重复子串的开头位置
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int preSameIndex = map.get(arr[i]); //最近的一个相同字符串的位置

                // 此处为预防preSameIndex有可能为当前无重复子串的前面，
                // 如4,1,2,3,1,2,3,4,5，当遍历到第二个4时，此时startIndex=5，当前无重复子串为1234，preSameIndex=1，此时不存在重复
                if (preSameIndex >= startIndex) {
                    startIndex = preSameIndex + 1;
                    sum = i - preSameIndex;
                } else {
                    sum++;
                    max = Math.max(max, sum);
                }
            } else {
                sum++;
                max = Math.max(max, sum);
            }
            map.put(arr[i], i);
        }
        return max;
    }

}
