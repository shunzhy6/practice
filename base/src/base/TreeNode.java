package base;

import java.util.List;

import complete.leetcode102.Leetcode102_1;

public class TreeNode {

    public int val = 0;
    public TreeNode left = null;
    public TreeNode right = null;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void print() {
        Leetcode102_1 leetcode1021 = new Leetcode102_1();
        List<List<Integer>> levelList = leetcode1021.levelOrder(this);
        levelList.forEach(list -> {

            System.out.println();
        });
    }

}
