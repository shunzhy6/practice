package leetcode46;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 * @author zhengyingshun
 * @date 2021/3/29 21:52
 */
public class Leetcode46 {

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) {
            return null;
        }

        return this.permute(nums, nums.length - 1);
    }

    public List<List<Integer>> permute(int[] nums, int right) {
        if (0 == right) {
            List<List<Integer>> lists = new ArrayList<>();
            List<Integer> first = new ArrayList<>();
            first.add(nums[right]);
            lists.add(first);
            return lists;
        }

        List<List<Integer>> lists = this.permute(nums, right - 1);
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> list : lists) {
            for (int i = 0; i <= list.size(); i++) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(i, nums[right]);
                result.add(newList);
            }
        }

        return result;
    }

}
