package complete.leetcode234;

import base.ListNode;

/**
 * 234. 回文链表
 * 请判断一个链表是否为回文链表。

 示例 1:
 输入: 1->2
 输出: false

 示例 2:
 输入: 1->2->2->1
 输出: true

 进阶：
 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？

 * @author zhengyingshun
 * @date 2021/3/24 17:50
 */
public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head.next.next;
        ListNode slow = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode pre = null;
        ListNode curr = head;
        while (curr != slow) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        //如果是奇数个节点，去掉后半部分的第一个节点。
        if (fast != null) {
            slow = slow.next;
        }

        while (pre != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }

        return true;
    }

}
