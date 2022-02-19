package leetcode39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. 组合总和
 * 给你一个 无重复元素 的整数数组candidates 和一个目标整数target，找出candidates中可以使数字和为目标数target 的 所有不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
 * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
 * 对于给定的输入，保证和为target 的不同组合数少于 150 个。
 *
 * 示例1：
 * 输入：candidates = [2,3,6,7], target = 7
 * 输出：[[2,2,3],[7]]
 * 解释：
 * 2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
 * 7 也是一个候选， 7 = 7 。
 * 仅有这两种组合。
 *
 * 示例2：
 * 输入: candidates = [2,3,5], target = 8
 * 输出: [[2,2,2,2],[2,3,3],[3,5]]
 *
 * 示例 3：
 * 输入: candidates = [2], target = 1
 * 输出: []
 *
 * 提示：
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * candidate 中的每个元素都 互不相同
 * 1 <= target <= 500
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-14
 */
public class Leetcode39_1 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // 排序
        Arrays.sort(candidates);

        combinationSum(result, candidates, target, 0, new ArrayList<>());

        return result;
    }

    public void combinationSum(List<List<Integer>> result, int[] candidates, int target,
            int index, List<Integer> list) {
        if (index >= candidates.length || candidates[index] > target) {
            if (!list.isEmpty()) {
                int newIndex = 0;
                for (int i = 0; i < candidates.length; i++) {
                    if (candidates[i] == list.get(list.size() - 1)) {
                        newIndex = i;
                        break;
                    }
                }
                target = target + list.get(list.size() - 1);
                list.remove(list.size() - 1);

                combinationSum(result, candidates, target, ++newIndex, list);
            }
        } else if (candidates[index] == target) {
            list.add(candidates[index]);
            result.add(list);

            if (list.size() >= 2) {
                List<Integer> newList = new ArrayList<>();
                for (int i = 0; i < list.size() - 2; i++) {
                    newList.add(list.get(i));
                }
                target = target + list.get(list.size() - 2);

                int newIndex = 0;
                for (int i = 0; i < candidates.length; i++) {
                    if (candidates[i] == list.get(list.size() - 2)) {
                        newIndex = i;
                        break;
                    }
                }

                combinationSum(result, candidates, target, ++newIndex, newList);
            }
        } else {
            list.add(candidates[index]);
            combinationSum(result, candidates, target - candidates[index], index, list);
        }
    }

}
