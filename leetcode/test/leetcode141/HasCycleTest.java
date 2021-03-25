package leetcode141;

import base.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class HasCycleTest {

    HasCycle hasCycle = new HasCycle();

    @Test
    public void hasCycle() throws Exception {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;

        ListNode node4 = new ListNode(4);
        node3.next = node4;

        node4.next = node2;

        boolean flag = hasCycle.hasCycle(node1);
        System.out.println(flag);

    }

}