package newcode61;

import java.util.HashMap;
import java.util.Map;

/**
 * 给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
 * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
 * 假设给出的数组中只存在唯一解
 * 例如：
 * 给出的数组为 {20, 70, 110, 150},目标值为90
 * 输出 index1=1, index2=2
 *
 * 示例1
 * 输入
 * [3,2,4],6
 * 返回值
 * [2,3]
 * @author zhengyingshun
 * @date 2021/3/28 19:44
 */
public class NC61 {

    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int t = target - i;
            if (map.containsKey(t)) {
                result[0] = map.get(t) + 1;
                result[1] = i + 1;
                break;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

}
