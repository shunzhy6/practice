package complete.leetcode1669;

import base.ListNode;
import org.junit.Test;

public class MergeInBetweenTest {

    MergeInBetween mergeInBetween = new MergeInBetween();

    @Test
    public void mergeInBetween1() throws Exception {
        ListNode l1 = new ListNode("0,1,2,3,4,5");
        ListNode l2 = new ListNode("1000000,1000001,1000002");
        ListNode listNode = mergeInBetween.mergeInBetween(l1, 3, 4, l2);
        // [0,1,2,1000000,1000001,1000002,5]
        listNode.print();
    }

    @Test
    public void mergeInBetween2() throws Exception {
        ListNode l1 = new ListNode("0,1,2,3,4,5,6");
        ListNode l2 = new ListNode("1000000,1000001,1000002,1000003,1000004");
        ListNode listNode = mergeInBetween.mergeInBetween(l1, 2, 5, l2);
        // [0,1,1000000,1000001,1000002,1000003,1000004,6]
        listNode.print();
    }

}