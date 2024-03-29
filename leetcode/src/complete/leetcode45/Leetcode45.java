package complete.leetcode45;

/**
 * 45. 跳跃游戏 II
 * 给你一个非负整数数组nums ，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * 假设你总是可以到达数组的最后一个位置。
 *
 * 示例 1:
 * 输入: nums = [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *     从下标为 0 跳到下标为 1 的位置，跳1步，然后跳3步到达数组的最后一个位置。
 *
 * 示例 2:
 * 输入: nums = [2,3,0,1,4]
 * 输出: 2
 *
 * 提示:
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 1000
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-16
 */
public class Leetcode45 {

    public int jump(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1;) {
            if (i + nums[i] >= nums.length - 1) {
                result++;
                break;
            }
            int step = 1;
            int maxStep = 1;
            for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
                if (j - i + nums[j] > maxStep) {
                    maxStep = j - i + nums[j];
                    step = j - i;
                }
            }
            i += step;
            result++;
        }
        return result;
    }

}
