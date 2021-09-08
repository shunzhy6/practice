package complete.leetcode17;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-08
 */
public class L17Test {

    L17 l17 = new L17();

    @Test
    public void letterCombinations1() {
        List<String> result = l17.letterCombinations("23");
        Assert.assertEquals("[ad,ae,af,bd,be,bf,cd,ce,cf]", result.toString().replace(" ", ""));
    }

    @Test
    public void letterCombinations2() {
        List<String> result = l17.letterCombinations("");
        Assert.assertEquals("[]", result.toString().replace(" ", ""));
    }

    @Test
    public void letterCombinations3() {
        List<String> result = l17.letterCombinations("2");
        Assert.assertEquals("[a,b,c]", result.toString().replace(" ", ""));
    }
}