package complete.leetcode106;

import java.util.HashMap;
import java.util.Map;

import base.TreeNode;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 * 给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，请你构造并返回这颗二叉树。
 *
 * 提示:
 * 1 <= inorder.length <= 3000
 * postorder.length == inorder.length
 * -3000 <= inorder[i], postorder[i] <= 3000
 * inorder和postorder都由 不同 的值组成
 * postorder中每一个值都在inorder中
 * inorder保证是树的中序遍历
 * postorder保证是树的后序遍历
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-05-17
 */
public class Leetcode106 {

    Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode buildTree(int[] inorder, int inStart, int inEnd,
            int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }
        TreeNode node = new TreeNode(postorder[postEnd]);

        int inIndex = inorderMap.get(postorder[postEnd]);
        int rightSize = inEnd - inIndex;

        node.left = buildTree(inorder, inStart, inIndex - 1,
                postorder, postStart, postEnd - rightSize - 1);
        node.right = buildTree(inorder, inIndex + 1, inEnd,
                postorder, postEnd - rightSize, postEnd - 1);

        return node;
    }

}
