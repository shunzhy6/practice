package complete.leetcode83;

import base.ListNode;
import org.junit.Test;

public class DeleteDuplicatesTest {

    DeleteDuplicates deleteDuplicates = new DeleteDuplicates();

    @Test
    public void deleteDuplicates() throws Exception {
        ListNode listNode = deleteDuplicates.deleteDuplicates(new ListNode("1,1,2,2,2,4"));
        listNode.print();
    }

}