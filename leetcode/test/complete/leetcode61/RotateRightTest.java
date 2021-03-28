package complete.leetcode61;

import base.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RotateRightTest {
    
    RotateRight rotateRight = new RotateRight();
    
    @Test
    public void rotateRight1() throws Exception {
        ListNode node = rotateRight.rotateRight(new ListNode("1,2,3,4,5"), 2);
        // 4,5,1,2,3
        Assert.assertEquals(node.getString(), "4,5,1,2,3");
    }

    @Test
    public void rotateRight2() throws Exception {
        ListNode node = rotateRight.rotateRight(new ListNode("0,1,2"), 4);
        // 2,0,1
        Assert.assertEquals("2,0,1", node.getString());
    }

    @Test
    public void rotateRight3() throws Exception {
        ListNode node = rotateRight.rotateRight(new ListNode("1,2,3,4,5"), 5);
        // 1,2,3,4,5
        Assert.assertEquals("1,2,3,4,5", node.getString());
    }

    @Test
    public void rotateRight4() throws Exception {
        ListNode node = rotateRight.rotateRight(null, 5);
        // 1,2,3,4,5
        Assert.assertNull(node);
    }

    @Test
    public void rotateRight5() throws Exception {
        ListNode node = rotateRight.rotateRight(new ListNode("1, 2"), 0);
        // 1,2
        Assert.assertEquals(node.getString(), "1,2");
    }

    @Test
    public void rotateRight6() throws Exception {
        ListNode node = rotateRight.rotateRight(new ListNode("1, 2"), 1);
        // 2,1
        Assert.assertEquals(node.getString(), "2,1");
    }

}