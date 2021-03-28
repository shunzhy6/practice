package complete.newcode45;

import base.TreeNode;
import org.junit.Test;

import java.util.Arrays;

public class NC45Test {

    private NC45 nc45 = new NC45();

    @Test
    public void threeOrders1() throws Exception {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;

        TreeNode leftNode = new TreeNode(2);
        treeNode.left = leftNode;

        TreeNode rightNode = new TreeNode(3);
        treeNode.right = rightNode;

        int[][] result = nc45.threeOrders(treeNode);
        System.out.println(Arrays.toString(result[0]));
        System.out.println(Arrays.toString(result[1]));
        System.out.println(Arrays.toString(result[2]));
    }

    @Test
    public void threeOrders2() throws Exception {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;

        TreeNode leftNode = new TreeNode(2);
        treeNode.left = leftNode;

        TreeNode rightNode = new TreeNode(3);
        treeNode.right = rightNode;

        leftNode.left = new TreeNode(4);
        rightNode.left = new TreeNode(5);
        rightNode.right = new TreeNode(6);

        int[][] result = nc45.threeOrders(treeNode);
        System.out.println(Arrays.toString(result[0]));
        System.out.println(Arrays.toString(result[1]));
        System.out.println(Arrays.toString(result[2]));
    }

}