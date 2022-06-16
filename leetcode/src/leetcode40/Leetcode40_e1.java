package leetcode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. 组合总和 II
 * 给定一个候选人编号的集合candidates和一个目标数target，找出candidates中所有可以使数字和为target的组合。
 * candidates中的每个数字在每个组合中只能使用一次。
 * 注意：解集不能包含重复的组合。
 *
 * 示例1:
 * 输入: candidates =[10,1,2,7,6,1,5], target =8,
 * 输出:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 *
 * 示例2:
 * 输入: candidates =[2,5,2,1,2], target =5,
 * 输出:
 * [
 * [1,2,2],
 * [5]
 * ]
 *
 * 提示:
 * 1 <=candidates.length <= 100
 * 1 <=candidates[i] <= 50
 * 1 <= target <= 30
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-15
 */
public class Leetcode40_e1 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
                for (int i = index; i >= 0 && i < candidates.length; i--) {
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
                for (int i = index; i >= 0 && i < candidates.length; i--) {
                    if (candidates[i] == list.get(list.size() - 2)) {
                        newIndex = i;
                        break;
                    }
                }

                combinationSum(result, candidates, target, ++newIndex, newList);
            }
        } else {
            list.add(candidates[index]);
            combinationSum(result, candidates, target - candidates[index], ++index, list);
        }
    }

}
