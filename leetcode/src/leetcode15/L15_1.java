package leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 *
 * 示例 1：
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 *
 * 示例 2：
 * 输入：nums = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：nums = [0]
 * 输出：[]
 *
 * 提示：
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-06
 */
public class L15_1 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(i -> map.compute(i, (k, v) -> v == null ? 1 : ++v));

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0) {
                break;
            }
            int pre = nums[i] - 1;
            for (int j = i + 1; j < nums.length; j++) {
                int z = -nums[i] - nums[j];
                if (pre == nums[j] || z < nums[j]) {
                    continue;
                }
                if (map.containsKey(z)) {
                    if (nums[i] == nums[j] && nums[j] == z) {
                        if (map.get(z) > 2) {
                            if (!result.contains(Stream.of(nums[i], nums[j], z).collect(Collectors.toList()))) {
                                result.add(Stream.of(nums[i], nums[j], z).collect(Collectors.toList()));
                            }
                        }
                    } else if (nums[j] == z || nums[i] == z) {
                        if (map.get(z) > 1) {
                            if (!result.contains(Stream.of(nums[i], nums[j], z).collect(Collectors.toList()))) {
                                result.add(Stream.of(nums[i], nums[j], z).collect(Collectors.toList()));
                            }
                        }
                    } else {
                        if (!result.contains(Stream.of(nums[i], nums[j], z).collect(Collectors.toList()))) {
                            result.add(Stream.of(nums[i], nums[j], z).collect(Collectors.toList()));
                        }
                    }
                }
                pre = nums[j];
            }
        }

        return result;
    }

}
