package complete.leetcode24;

import org.junit.Assert;
import org.junit.Test;

import base.ListNode;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-13
 */
public class L24Test {

    L24 l24 = new L24();

    @Test
    public void swapPairs1() {
        ListNode node = l24.swapPairs(new ListNode(new int[] {1,2,3,4}));
        Assert.assertEquals("2,1,4,3", node.getString());
    }

    @Test
    public void swapPairs2() {
        ListNode node = l24.swapPairs(new ListNode());
        Assert.assertEquals("0", node.getString());
    }

    @Test
    public void swapPairs3() {
        ListNode node = l24.swapPairs(new ListNode(new int[] {1}));
        Assert.assertEquals("1", node.getString());
    }
}