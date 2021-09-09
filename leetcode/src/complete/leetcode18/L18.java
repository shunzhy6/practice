package complete.leetcode18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 四数之和
 * 给你一个由 n 个整数组成的数组nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组[nums[a], nums[b], nums[c], nums[d]] ：
 * 0 <= a, b, c, d< n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 *
 * 示例 1：
 * 输入：nums = [1,0,-1,0,-2,2], target = 0
 * 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 *
 * 示例 2：
 * 输入：nums = [2,2,2,2,2], target = 8
 * 输出：[[2,2,2,2]]
 *
 * 提示：
 * 1 <= nums.length <= 200
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-09
 */
public class L18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<List<Integer>> threeSum = threeSum(i + 1, nums, target - nums[i]);
            if (!threeSum.isEmpty()) {
                for (List<Integer> list : threeSum) {
                    list.add(nums[i]);
                    result.add(list);
                }
            }
        }

        return result;
    }

    private List<List<Integer>> threeSum(int startIndex, int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = startIndex; i < nums.length - 2; i++) {
            if (i > startIndex && nums[i] == nums[i - 1]) {
                continue;
            }
            int r = nums.length - 1;
            for (int j = i + 1; j < r; ) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                int sum = nums[j] + nums[r] + nums[i];
                if (sum == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[j]);
                    list.add(nums[r]);
                    list.add(nums[i]);
                    result.add(list);
                    j++;
                    r--;
                } else if (sum < target) {
                    j++;
                } else {
                    r--;
                }
            }
        }

        return result;
    }

}
