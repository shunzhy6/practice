package complete;

import base.ListNode;

/**
 * 2 两数相加
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *
 * 示例 1：
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * 示例 2：
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 *
 * 示例 3：
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *  
 *
 * 提示：
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n = 0;

        ListNode head = new ListNode();
        ListNode current = head;

        while (l1 != null) {
            int sum;
            if (l2 != null) {
                sum = l1.val + l2.val + n;
                l2 = l2.next;
            } else {
                sum = l1.val + n;
            }
            if (sum > 9) {
                n = 1;
                sum = sum - 10;
            } else {
                n = 0;
            }
            current.next = new ListNode(sum);
            current = current.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + n;
            if (sum > 9) {
                n = 1;
                sum = sum - 10;
            } else {
                n = 0;
            }
            current.next = new ListNode(sum);
            current = current.next;
        }

        if (n > 0) {
            current.next = new ListNode(n);
        }

        return head.next;
    }

}