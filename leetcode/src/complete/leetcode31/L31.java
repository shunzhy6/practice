package complete.leetcode31;

import java.util.Arrays;

/**
 * 31. 下一个排列
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 必须 原地 修改，只允许使用额外常数空间。
 *
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 *
 * 示例 2：
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 *
 * 示例 3：
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 *
 * 示例 4：
 * 输入：nums = [1]
 * 输出：[1]
 *
 * 提示：
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-15
 */
public class L31 {

    public void nextPermutation(int[] nums) {
        int tmp = nums[nums.length - 1];
        int i = nums.length - 2;
        for (; i >= 0; i--) {
            if (nums[i] < tmp) {
                break;
            }
            tmp = Math.max(nums[i], nums[i + 1]);
        }
        if (i >= 0) {
            // 找出比nums[i]大的且最接近nums[i]的值，与nums[i]进行交换
            int j = nums.length - 1;
            int tIndex = nums.length - 1;
            for (; j > i; j--) {
                if (nums[j] == tmp) {
                    tIndex = j;
                } else if (nums[j] > nums[i] && nums[j] < tmp) {
                    tmp = nums[j];
                    tIndex = j;
                }
            }

            tmp = nums[tIndex];
            nums[tIndex] = nums[i];
            nums[i] = tmp;

            // nums[i]后面的数据进行升序排序
            Arrays.sort(nums, i + 1, nums.length);
        } else {
            Arrays.sort(nums);
        }
    }

}
