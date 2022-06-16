package complete.leetcode49;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-19
 */
public class Leetcode49Test {

    Leetcode49 leetcode49 = new Leetcode49();

    @Test
    public void groupAnagrams() {
        List<List<String>> result = leetcode49.groupAnagrams(new String[] {"ddddddddddg","dgggggggggg"});
        System.out.println(Arrays.toString(result.toArray()));//[["dgggggggggg"],["ddddddddddg"]]
    }

    @Test
    public void groupAnagrams1() {
        List<List<String>> result = leetcode49.groupAnagrams(new String[] {""});
        System.out.println(Arrays.toString(result.toArray()));
    }

    @Test
    public void groupAnagrams2() {
        List<List<String>> result = leetcode49.groupAnagrams(new String[] {"a"});
        System.out.println(Arrays.toString(result.toArray()));
    }


    @Test
    public void groupAnagrams3() {
        List<List<String>> result = leetcode49.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(Arrays.toString(result.toArray())); //[["bat"],["nat","tan"],["ate","eat","tea"]]
    }

}