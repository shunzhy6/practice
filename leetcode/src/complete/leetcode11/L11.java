package complete.leetcode11;

/**
 * 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,ai) 和 (i, 0)
 * 。找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器。
 *
 * 示例 1：
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为49。
 *
 * 示例 2：
 * 输入：height = [1,1]
 * 输出：1
 *
 * 示例 3：
 * 输入：height = [4,3,2,1,4]
 * 输出：16
 *
 * 示例 4：
 * 输入：height = [1,2,1]
 * 输出：2
 *
 * 提示：
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104

 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-06
 */
public class L11 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        // 体积最大，则需要x、y都尽可能的大，对于x轴来讲，则位于数组的两侧时，x最大，所以从左右两侧开始遍历
        while (left < right) {
            int current = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, current);
            /*
            当height[left] == height[right]，即y轴数值相等时，此时的面积肯定是以left 或 right为y轴时最大的面积，所以left跟right同时移动
            当height[left] < height[right]时，即right所在的y轴比较长，故而与这个y轴所组成的面积还有可能更大，所以left++
            当height[left] > height[right]时，与上面相反
             */
            if (height[left] == height[right]) {
                left++;
                right--;
            } else if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

}
