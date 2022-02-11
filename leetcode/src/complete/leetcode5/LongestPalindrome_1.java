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
public class LongestPalindrome_1 {

    /**
     * 暴力解法，O(n^3)
     * @author zhengyingshun <zhengyingshun@kuaishou.com>
     * Created on 2022-02-11
     */
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s, i, j) && maxLength < j - i + 1) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    public boolean isPalindrome(String s, int start, int end) {
        int len = end + start + 1;
        for (; start < len / 2; start++, end--) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
        }
        return true;
    }

}
