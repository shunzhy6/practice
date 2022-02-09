package complete.leetcode34;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回[-1, -1]。
 *
 * 进阶：
 * 你可以设计并实现时间复杂度为O(log n)的算法解决此问题吗？
 *
 * 示例 1：
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 *
 * 示例2：
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 *
 * 示例 3：
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *
 * 提示：
 * 0 <= nums.length <= 10^5
 * -10^9<= nums[i]<= 10^9
 * nums是一个非递减数组
 * -10^9<= target<= 10^9
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-17
 */
public class L34 {

    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        if (r < 0) {
            return new int[] {-1, -1};
        }

        int left = searchLeft(nums, l, r, target);
        int right = searchRight(nums, l, r, target);

        return new int[] {left, right};
    }

    private int searchLeft(int[] nums, int l, int r, int target) {
        if (nums[l] == target) {
            return l;
        } else if (l >= r - 1) {
            return nums[r] == target ? r : -1;
        } else {
            int m = (l + r) / 2;
            if (nums[m] >= target) {
                return searchLeft(nums, l, m, target);
            } else {
                return searchLeft(nums, m, r, target);
            }
        }
    }

    private int searchRight(int[] nums, int l, int r, int target) {
        if (nums[r] == target) {
            return r;
        } else if (l >= r - 1) {
            return nums[l] == target ? l : -1;
        } else {
            int m = (l + r) / 2;
            if (nums[m] <= target) {
                return searchRight(nums, m, r, target);
            } else {
                return searchRight(nums, l, m, target);
            }
        }
    }
    
}
