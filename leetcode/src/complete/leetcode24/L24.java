package complete.leetcode24;

import base.ListNode;

/**
 * 24. 两两交换链表中的节点
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-13
 */
public class L24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }

}
