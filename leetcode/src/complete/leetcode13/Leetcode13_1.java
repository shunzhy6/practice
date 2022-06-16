package complete.leetcode13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
public class Leetcode13_1 {

    private List<List<Integer>> lists = new ArrayList<>();
    private Set<String> set = new HashSet<>();

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return null;
        }

        Arrays.sort(nums);

        this.threeSum(nums, 0, nums.length - 1);

        for (String s : set) {
            List<Integer> list = new ArrayList<>();
            String[] ints = s.split(",");
            list.add(Integer.parseInt(ints[0]));
            list.add(Integer.parseInt(ints[1]));
            list.add(Integer.parseInt(ints[2]));
            lists.add(list);
        }

        return lists;
    }

    public void threeSum(int[] nums, int left, int right) {
        if (right - left < 3) {
            return;
        }

        if (nums[left] + nums[left + 1] + nums[right] == 0) {
            set.add(nums[left] + "," + nums[left + 1] + "," + nums[right]);
        }

        if (nums[left] + nums[right - 1] + nums[right] == 0) {
            set.add(nums[left] + "," + nums[right - 1] + "," + nums[right]);
        }

        this.threeSum(nums, left + 1, right);
        this.threeSum(nums, left, right - 1);
    }

}
