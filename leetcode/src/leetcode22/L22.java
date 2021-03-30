package leetcode22;

import java.util.ArrayList;
import java.util.List;

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
 * @date 2021/3/29 21:57
 */
public class L22 {

    public List<String> generateParenthesis(int n) {
        if (n == 1) {
            List<String> result = new ArrayList<>();
            result.add("()");
            return result;
        }

        List<String> list = this.generateParenthesis( n - 1);
        List<String> result = new ArrayList<>();

        result.add(list.get(0) + "()");
        result.add("(" + list.get(0) + ")");
        for (int i = 1; i < list.size(); i++) {
            result.add(list.get(i) + "()");
            result.add("()" + list.get(i));
            result.add("(" + list.get(i) + ")");
        }

        return result;
    }

}
