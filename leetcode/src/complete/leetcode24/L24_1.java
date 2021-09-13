package complete.leetcode24;

import base.ListNode;

/**
 * 24. 两两交换链表中的节点
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-13
 */
public class L24_1 {

    public ListNode swapPairs(ListNode head) {
        ListNode hHead = new ListNode();
        hHead.next = head;

        ListNode node = hHead;
        while (node.next != null && node.next.next != null) {
            ListNode node1 = node.next;
            ListNode node2 = node1.next;
            node1.next = node2.next;
            node2.next = node1;
            node.next = node2;

            node = node.next.next;
        }
        return hHead.next;
    }

}
