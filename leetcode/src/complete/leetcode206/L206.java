package complete.leetcode206;

import base.ListNode;

/**
 * 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL

 * @author zhengyingshun
 * @date 2021/3/24 15:45
 */
public class L206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 错误的递归
     * @author zhengyingshun
     * @date 2021/3/26 13:58
     */
    public ListNode reverseList1(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode node = this.reverseList1(head.next);
        node.next = node;

        return node;

    }

}
