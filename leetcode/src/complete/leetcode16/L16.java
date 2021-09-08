package complete.leetcode16;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * 给定一个包括n 个整数的数组nums和 一个目标值target。找出nums中的三个整数，使得它们的和与target最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 示例：
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *
 * 提示：
 * 3 <= nums.length <= 10^3
 * -10^3<= nums[i]<= 10^3
 * -10^4<= target<= 10^4
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-08
 */
public class L16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int r = nums.length - 1;
            for (int j = i + 1; j < r;) {
                int sum = nums[j] + nums[r] + nums[i];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    r--;
                }
            }
        }

        return closest;
    }

}
