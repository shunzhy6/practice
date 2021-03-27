package newcode52;

import java.util.Stack;

/**
 * 题目描述
 * 给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
 * 括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 *
 * 示例1
 * 输入
 * "["
 * 返回值
 * false
 *
 * 示例2
 * 输入
 * "[]"
 * 返回值
 * true
*/
public class NC52 {

    public boolean check(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            if (stack.empty()) {
                stack.add(c);
                continue;
            }
            boolean flag = stack.peek() == '(' && c == ')' ||
                    stack.peek() == '[' && c == ']' ||
                    stack.peek() == '{' && c == '}';
            if (flag) {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        return stack.empty();
    }

}
