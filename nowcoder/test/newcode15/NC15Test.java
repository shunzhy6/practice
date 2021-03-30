package newcode15;

import base.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NC15Test {


    @Test
    public void levelOrder() throws Exception {
        NC15 nc15 = new NC15();
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;

        TreeNode leftNode = new TreeNode(2);
        treeNode.left = leftNode;

        TreeNode rightNode = new TreeNode(3);
        treeNode.right = rightNode;

        ArrayList<ArrayList<Integer>> result = nc15.levelOrder(treeNode);
        System.out.println(result.toString());
    }

    @Test
    public void levelOrder2() throws Exception {
        NC15 nc15 = new NC15();

        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;

        TreeNode leftNode = new TreeNode(2);
        treeNode.left = leftNode;

        TreeNode rightNode = new TreeNode(3);
        treeNode.right = rightNode;

        leftNode.left = new TreeNode(4);
        rightNode.left = new TreeNode(5);
        rightNode.right = new TreeNode(6);

        ArrayList<ArrayList<Integer>> result = nc15.levelOrder(treeNode);
        System.out.println(result.toString());
    }


}