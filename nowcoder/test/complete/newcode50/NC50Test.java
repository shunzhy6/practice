package complete.newcode50;

import base.ListNode;
import org.junit.Test;

public class NC50Test {

    private NC50 nc50 = new NC50();

    @Test
    public void reverseKGroup() throws Exception {
        ListNode listNode = nc50.reverseKGroup(new ListNode("1,2,3,4,5"), 3);
        // 3,2,1,4,5
        listNode.print();
    }

    @Test
    public void reverseKGroup2() throws Exception {
        ListNode listNode = nc50.reverseKGroup(new ListNode("1,2,3,4,5"), 2);
        // 2,1,4,3,5
        listNode.print();
    }

}