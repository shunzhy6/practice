package leetcode21;

import base.ListNode;

/**
 * Definition for singly-linked list.
21. 合并两个有序链表
 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

 示例 1：
 输入：l1 = [1,2,4], l2 = [1,3,4]
 输出：[1,1,2,3,4,4]

 示例 2：
 输入：l1 = [], l2 = []
 输出：[]

 示例 3：
 输入：l1 = [], l2 = [0]
 输出：[0]

 提示：
 两个链表的节点数目范围是 [0, 50]
 -100 <= Node.val <= 100
 l1 和 l2 均按 非递减顺序 排列
 * @author zhengyingshun
 * @date 2021/3/24 13:53
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head;
        if (l1.val <= l2.val) {
            head = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            head = new ListNode(l2.val);
            l2 = l2.next;
        }

        ListNode next = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                next.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                next.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            next = next.next;
        }

        while (l1 != null) {
            next.next = new ListNode(l1.val);
            l1 = l1.next;
            next = next.next;
        }

        while (l2 != null) {
            next.next = new ListNode(l2.val);
            l2 = l2.next;
            next = next.next;
        }

        return head;
    }



}

