package complete.leetcode14;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-04-16
 */
public class L14Test {

    private L14 l14 = new L14();

    @Test
    public void longestCommonPrefix1() {
        String longest = l14.longestCommonPrefix(new String[]{"flower","flow","flight"});
        Assert.assertEquals("fl", longest);
    }

    @Test
    public void longestCommonPrefix2() {
        String longest = l14.longestCommonPrefix(new String[]{"lower","flow","flight"});
        Assert.assertEquals("", longest);
    }

}