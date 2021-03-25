package leetcode206;

import base.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class L206Test {

    L206 l206 = new L206();

    @Test
    public void reverseList() throws Exception {

        ListNode result = l206.reverseList(new ListNode("1,2,3,4,5"));

        result.print();
    }

}