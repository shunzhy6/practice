package complete.leetcode206;

import base.ListNode;
import org.junit.Test;

public class L206_1Test {

    L206_1 l206 = new L206_1();

    @Test
    public void reverseList() throws Exception {
        ListNode result = l206.reverseList(new ListNode("1,2,3,4,5"));

        result.print();
    }

}