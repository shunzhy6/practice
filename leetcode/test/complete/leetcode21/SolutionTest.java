package complete.leetcode21;

import base.ListNode;
import org.junit.Test;


public class SolutionTest {

    Solution solution = new Solution();


    @Test
    public void test() {
        ListNode l1 = new ListNode("1,2,4");
        ListNode l2 = new ListNode("1,3,4");

        ListNode result = solution.mergeTwoLists(l1, l2);
        // [1,1,2,3,4,4]
        result.print();
    }

    @Test
    public void test1() {
        ListNode result = solution.mergeTwoLists(null, null);
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode("0");

        ListNode result = solution.mergeTwoLists(l1, null);
        result.print();
    }


}
