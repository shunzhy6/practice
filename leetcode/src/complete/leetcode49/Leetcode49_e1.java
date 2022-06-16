package complete.leetcode49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 49. 字母异位词分组
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
 *
 * 示例 1:
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * 示例 2:
 * 输入: strs = [""]
 * 输出: [[""]]
 *
 * 示例 3:
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 *
 * 提示：
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i]仅包含小写字母
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-16
 */
public class Leetcode49_e1 {

    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortStrs = new String[strs.length];
        Map<Character, Integer> set = new TreeMap<>();
        for (int i = 0; i < strs.length; i++) {
            set.clear();
            for (char c : strs[i].toCharArray()) {
                set.put(c, 0);
            }
            sortStrs[i] = Arrays.toString(set.keySet().toArray());
        }

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            map.compute(sortStrs[i], (k, v) -> {
                if (v == null) {
                    List<String> list = new ArrayList<>();
                    list.add(s);
                    return list;
                } else {
                    v.add(s);
                    return v;
                }
            });
        }

        return new ArrayList<>(map.values());
    }

}
