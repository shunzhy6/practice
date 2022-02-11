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
public class LongestPalindrome_2 {

    /**
     * 动态规划，O(n^2)
     * @author zhengyingshun <zhengyingshun@kuaishou.com>
     * Created on 2022-02-11
     */
    public String longestPalindrome(String s) {
        boolean[][] depth = new boolean[s.length()][s.length()];
        // 对角上上面为true
        for (int i = 0; i < s.length(); i++) {
            depth[i][i] = true;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j) && (j == i - 1 || depth[i - 1][j + 1])) {
                    depth[i][j] = true;
                    if (maxLength < i - j + 1) {
                        maxLength = i - j + 1;
                        start = j;
                    }
                } else {
                    depth[i][j] = false;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }


}
