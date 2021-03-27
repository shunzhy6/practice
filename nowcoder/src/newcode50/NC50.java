package newcode50;

import base.ListNode;

/**
 * 将给出的链表中的节点每 k 个一组翻转，返回翻转后的链表
 * 如果链表中的节点数不是 k 的倍数，将最后剩下的节点保持原样
 * 你不能更改节点中的值，只能更改节点本身。
 * 要求空间复杂度 O(1)
 *
 * 例如：
 * 给定的链表是1→2→3→4→5
 * 对于  k = 2, 你应该返回 2→1→4→3→5
 * 对于 k = 3, 你应该返回 3→2→1→4→5
 *
 * 示例1
 * 输入
 * {1,2,3,4,5},2
 * 返回值
 * {2,1,4,3,5}
*/
public class NC50 {

    int level = 0;

    /**
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        // 循环找到下一个反转的头节点
        ListNode next = head;
        int i = 0;
        while (i != k && next != null) {
            i++;
            next = next.next;
        }
        // i == k 代表还存在满足反转分组大小的链表
        if (i == k) {
            // 递归反转
            ListNode node = this.reverseKGroup(next, k);

            // 执行反转
            level = 0;
            ListNode reverseNode = this.reverseKGroup1(head, k);

            // 将反转后的链表的最后一个节点的next指向递归返回后的链表
            ListNode lastNode = reverseNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;

            return reverseNode;
        } else {
            return head;
        }
    }

    public ListNode reverseKGroup1 (ListNode head, int k) {
        level++;
        if (head == null || head.next == null || level == k) {
            return head;
        }
        ListNode node = this.reverseKGroup1(head.next, k);
        head.next.next = head;
        head.next = null;
        return node;
    }

}
