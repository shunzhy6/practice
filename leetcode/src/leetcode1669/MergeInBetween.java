package leetcode1669;

import base.ListNode;

/**
 * 1669. 合并两个链表
 * 给你两个链表list1 和list2，它们包含的元素分别为n 个和m 个。
 *
 * 请你将list1中第a个节点到第b个节点删除，并将list2接在被删除节点的位置。
 *
 * 下图中蓝色边和节点展示了操作后的结果：

 * 请你返回结果链表的头指针。

 * 示例 1：
 * 输入：list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
 * 输出：[0,1,2,1000000,1000001,1000002,5]
 * 解释：我们删除 list1 中第三和第四个节点，并将 list2 接在该位置。上图中蓝色的边和节点为答案链表。
 *
 * 示例 2：
 * 输入：list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
 * 输出：[0,1,1000000,1000001,1000002,1000003,1000004,6]
 * 解释：上图中蓝色的边和节点为答案链表。
 *
 * 提示：
 * 3 <= list1.length <= 104
 * 1 <= a <= b < list1.length - 1
 * 1 <= list2.length <= 104
 */
public class MergeInBetween {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode aNode = list1;
        ListNode bNode = list1;

        int i = 0;
        while (i < b) {
            i++;
            if (i < a) {
                aNode = aNode.next;
            }
            bNode = bNode.next;
        }
        aNode.next = list2;

        ListNode lastNode = list2;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = bNode.next;
        bNode.next = null;

        return list1;
    }

}
