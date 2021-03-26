package leetcode61;

import base.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateRightTest {
    
    RotateRight rotateRight = new RotateRight();
    
    @Test
    public void rotateRight1() throws Exception {
        ListNode node = rotateRight.rotateRight(new ListNode("1,2,3,4,5"), 2);
        // 4,5,1,2,3
        node.print();
    }

    @Test
    public void rotateRight2() throws Exception {
        ListNode node = rotateRight.rotateRight(new ListNode("0,1,2"), 4);
        // 2,0,1
        node.print();
    }

    @Test
    public void rotateRight3() throws Exception {
        ListNode node = rotateRight.rotateRight(new ListNode("1,2,3,4,5"), 5);
        // 1,2,3,4,5
        node.print();
    }

}