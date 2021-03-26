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
public class L206_1 {


    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode result = new ListNode(head.val);

        while (head.next != null) {
            head = head.next;

            ListNode node = result;
            result = new ListNode(head.val);
            result.next = node;
        }

        return result;
    }

    public ListNode reverseList1(ListNode head) {
        ListNode result = null;
        ListNode current = head;

        while (current != null) {
            ListNode node = current.next;

            current.next = result;
            result = current;

            current = node;
        }

        return result;
    }





}
