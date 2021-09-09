package complete.leetcode22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 括号生成
 * 数字 n代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 示例 1：
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 *
 * 示例 2：
 * 输入：n = 1
 * 输出：["()"]
 *
 * 提示：
 * 1 <= n <= 8
 * @author zhengyingshun
 * @date 2021/9/9 21:57
 */
public class L22 {

    public List<String> generateParenthesis(int n) {
        if (n == 1) {
            List<String> result = new ArrayList<>();
            result.add("()");
            return result;
        }

        List<String> list = this.generateParenthesis( n - 1);

        Set<String> set = new HashSet<>();
        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                set.add(s.substring(0, i) + "()" + s.substring(i));
            }
        }
        return new ArrayList<>(set);
    }

}
