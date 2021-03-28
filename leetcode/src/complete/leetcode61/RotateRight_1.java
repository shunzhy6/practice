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
public class RotateRight_1 {

    /**
     * 采用两次遍历链表的方式
     * @author zhengyingshun
     * @date 2021/3/28 23:18
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int size = 1; //链表大小
        ListNode last = head; //链表最后一个元素
        while (last.next != null) {
            size++;
            last = last.next;
        }

        int preK = size - k % size;
        if (preK == size) {
            return head;
        }

        ListNode preNode = head;
        while (preK-- > 1) {
            preNode = preNode.next;
        }

        ListNode res = preNode.next;
        preNode.next = null;
        last.next = head;
        return res;
    }

}
