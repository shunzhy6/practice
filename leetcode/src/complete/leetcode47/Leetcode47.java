package complete.leetcode47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 47. 全排列 II
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 *
 * 示例 1：
 * 输入：nums = [1,1,2]
 * 输出：
 * [[1,1,2],
 *  [1,2,1],
 *  [2,1,1]]
 *
 * 示例 2：
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * 提示：
 * 1 <= nums.length <= 8
 * -10 <= nums[i] <= 10
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-16
 */
public class Leetcode47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = permute(nums, 0);

        Set<String> set = new HashSet<>();
        list.removeIf(i -> {
            StringBuilder sb = new StringBuilder();
            i.forEach(sb::append);
            if (set.contains(sb.toString())) {
                return true;
            } else {
                set.add(sb.toString());
            }
            return false;
        });

        return list;
    }

    public List<List<Integer>> permute(int[] nums, int index) {
        List<List<Integer>> result = new ArrayList<>();
        if (index == nums.length - 1) {
            List<Integer> newList = new ArrayList<>();
            newList.add(nums[index]);
            result.add(newList);
            return result;
        }

        List<List<Integer>> nextPer = permute(nums, index + 1);
        for (int i = 0; i < nums.length - index; i++) {
            for (List<Integer> list : nextPer) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(i, nums[index]);
                result.add(newList);
            }
        }

        return result;
    }

}
