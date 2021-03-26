package complete.leetcode21;

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
public class Solution3 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode node;
        if (l1.val <= l2.val) {
            node = new ListNode(l1.val);
            node.next = this.mergeTwoLists(l1.next, l2);
        } else {
            node = new ListNode(l2.val);
            node.next = this.mergeTwoLists(l1, l2.next);
        }

        return node;
    }



}

