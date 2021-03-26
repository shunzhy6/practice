package leetcode19;

import base.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthFromEndTest {

    RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();

    @Test
    public void removeNthFromEnd1() throws Exception {
        ListNode listNode = removeNthFromEnd.removeNthFromEnd(new ListNode("1,2,3,4,5"), 2);
        // [1,2,3,5]
        listNode.print();
    }

    @Test
    public void removeNthFromEnd2() throws Exception {
        ListNode listNode = removeNthFromEnd.removeNthFromEnd(new ListNode("1"), 1);
        // []
        System.out.println(listNode);
    }


    @Test
    public void removeNthFromEnd3() throws Exception {
        ListNode listNode = removeNthFromEnd.removeNthFromEnd(new ListNode("1,2"), 1);
        // [1]
        listNode.print();
    }

}