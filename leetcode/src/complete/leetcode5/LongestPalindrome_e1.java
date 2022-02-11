package complete.leetcode5;

/**
 * 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 示例 1：
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 *
 * 示例 2：
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 * 示例 3：
 * 输入：s = "a"
 * 输出："a"
 *
 * 示例 4：
 * 输入：s = "ac"
 * 输出："a"
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母（大写和/或小写）组成
 * @author zhengyingshun
 * @date 2021/3/29 21:44
 */
public class LongestPalindrome_e1 {

    public String longestPalindrome(String s) {
        if (isPalindrome(s)) {
            return s;
        }

        // 每个子串都是n^3次递归
        String left = this.longestPalindrome(s.substring(0, s.length() - 1));
        String right = this.longestPalindrome(s.substring(1));
        return left.length() > right.length() ? left : right;
    }

    public boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
