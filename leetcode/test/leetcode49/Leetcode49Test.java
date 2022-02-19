package leetcode49;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
        System.out.println(Arrays.toString(result.toArray()));
    }
}