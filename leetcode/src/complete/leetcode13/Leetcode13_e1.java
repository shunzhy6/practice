package complete.leetcode13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？
 * 请你找出所有和为 0 且不重复的三元组。
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
 * -10^5 <= nums[i] <= 10^5
 * @author zhengyingshun
 * @date 2021/3/29 21:48
 */
public class Leetcode13_e1 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<List<Integer>> twoList = twoSum(nums, i + 1, -nums[i]);
            if (!twoList.isEmpty()) {
                int first = nums[i];
                twoList.forEach(list -> list.add(0, first));
                result.addAll(twoList);
            }
        }

        return result;
    }

    public List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> twoList = new ArrayList<>();

        for (int i = start; i < nums.length; i++) {
            int j = start + 1;
            for (; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    twoList.add(list);
                    break;
                } else if (nums[i] + nums[j] > target) {
                    break;
                }
            }
            if (i == j - 1) {
                break;
            }
        }

        return twoList;
    }



}
