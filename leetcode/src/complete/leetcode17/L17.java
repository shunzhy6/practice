package complete.leetcode17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 2:abc, 3:def, 4:ghi, 5:jkl, 6:mno, 7:pqrs, 8:tuv, 9:wxyz
 *
 * 示例 1：
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * 示例 2：
 * 输入：digits = ""
 * 输出：[]
 *
 * 示例 3：
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 *
 * 提示：
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-08
 */
public class L17 {

//    int[] index = new int[] {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
//    String[] combinations = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    Map<Character, String[]> map = new HashMap<Character, String[]>() {{
        put('2', new String[] {"a", "b", "c"});
        put('3', new String[] {"d", "e", "f"});
        put('4', new String[] {"g", "h", "i"});
        put('5', new String[] {"j", "k", "l"});
        put('6', new String[] {"m", "n", "o"});
        put('7', new String[] {"p", "q", "r", "s"});
        put('8', new String[] {"t", "u", "v"});
        put('9', new String[] {"w", "x", "y", "z"});
    }};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.equals("")) {
            return result;
        }

        int i = 0;
        String[] combinations = map.get(digits.charAt(i));
        for (String combination : combinations) {
            if (i + 1 < digits.length()) {
                List<String> list = letterCombinations(digits.substring(i + 1));
                list.forEach(s -> result.add(combination + s));
            } else {
                result.add(combination);
            }
        }

        return result;
    }

}
