package leetcode19;

import base.ListNode;

/**
 * 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第n个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 *
 * 示例 1：
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 *
 * 示例 2：
 * 输入：head = [1], n = 1
 * 输出：[]
 *
 * 示例 3：
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 *
 * 提示：
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nNode = head;
        for (int i = 0; i < n; i++) {
            nNode = nNode.next;
        }

        if (nNode == null) {
            return null;
        }

        ListNode preNode = head;
        while (nNode.next != null) {
            preNode = preNode.next;
            nNode = nNode.next;
        }

        if (preNode.next != null) {
            preNode.next = preNode.next.next;
        } else {
            preNode.next = null;
        }

        return head;
    }

}
