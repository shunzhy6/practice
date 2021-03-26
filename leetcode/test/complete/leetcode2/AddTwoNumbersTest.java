package complete.leetcode2;

import base.ListNode;
import org.junit.Test;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void addTwoNumbers1() throws Exception {
        ListNode l1 = new ListNode("2,4,3");
        ListNode l2 = new ListNode("5,6,4");
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        // [7,0,8]
        result.print();
    }

    @Test
    public void addTwoNumbers2() throws Exception {
        ListNode l1 = new ListNode("0");
        ListNode l2 = new ListNode("0");
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        // [0]
        result.print();
    }

    @Test
    public void addTwoNumbers3() throws Exception {
        ListNode l1 = new ListNode("9,9,9,9,9,9,9");
        ListNode l2 = new ListNode("9,9,9,9");
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        // [8,9,9,9,0,0,0,1]
        result.print();
    }

}