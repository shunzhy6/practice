package base;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int[] vals) {
        this(vals[0]);
        ListNode listNode = this;
        for (int i = 1; i < vals.length; i++) {
            listNode.next = new ListNode(vals[i]);
            listNode = listNode.next;
        }
    }

    public ListNode(String vals) {
        this();
        vals = vals.trim();
        String[] str = vals.split(",");
        this.val = Integer.parseInt(str[0]);

        ListNode listNode = this;
        for (int i = 1; i < str.length; i++) {
            listNode.next = new ListNode(Integer.parseInt(str[i]));
            listNode = listNode.next;
        }
    }

    public void print() {
        StringBuilder sb = new StringBuilder();

        ListNode listNode = this;
        while (listNode != null) {
            sb.append(listNode.val).append(", ");
            listNode = listNode.next;
        }

        System.out.println(this.toString() + ": [" + sb.toString().substring(0, sb.length() - 2) + "]");
    }

    public String getString() {
        if (this == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        ListNode listNode = this;
        while (listNode != null) {
            sb.append(listNode.val).append(",");
            listNode = listNode.next;
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

}
