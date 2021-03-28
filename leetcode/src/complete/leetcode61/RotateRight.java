package complete.leetcode61;

import base.ListNode;

/**
 * 61. 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动k个位置，其中k是非负数。
 *
 * 示例1:
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 *
 * 示例2:
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步:0->1->2->NULL
 * 向右旋转 4 步:2->0->1->NULL

 */
public class RotateRight {

    /**
     * 快慢指针
     * @author zhengyingshun
     * @date 2021/3/28 23:19
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int i = 1;

        ListNode fast = head;
        ListNode slow = head;
        ListNode sslow = head;
        while (fast.next != null) {
            i++;
            fast = fast.next;
            if (i > k) {
                slow = slow.next;
            }
            if (i > k + 1) {
                sslow = sslow.next;
            }
        }

        if (i == k) {
            return head;
        } if (i > k) {
            fast.next = head;
            sslow.next = null;
            return slow;
        } else {
            return this.rotateRight(head, k % i);
        }

    }

}
