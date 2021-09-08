package complete.leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class L15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        // 转换为两数和
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int r = nums.length - 1;
            for (int j = i + 1; j < r; ) {
                int z = -nums[i] - nums[j];
                if (j > i + 1 && nums[j] == nums[j - 1] || z < nums[j]) {
                    j++;
                    continue;
                }
                int sum = nums[i] + nums[j] + nums[r];
                if (sum == 0) {
                    result.add(Stream.of(nums[i], nums[j], nums[r]).collect(Collectors.toList()));
                    j++;
                    r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    j++;
                }
            }
        }

        return result;
    }

}
