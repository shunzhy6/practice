package complete.leetcode105;

import base.TreeNode;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * 给定两个整数数组preorder 和 inorder，其中preorder 是二叉树的先序遍历， inorder是同一棵树的中序遍历，请构造二叉树并返回其根节点。
 *
 * 提示:
 * 1 <= preorder.length <= 3000
 * inorder.length == preorder.length
 * -3000 <= preorder[i], inorder[i] <= 3000
 * preorder和inorder均 无重复 元素
 * inorder均出现在preorder
 * preorder保证 为二叉树的前序遍历序列
 * inorder保证 为二叉树的中序遍历序列
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-05-17
 */
public class Leetcode105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode head = new TreeNode();

        buildTree(head, preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

        return head;
    }

    public void buildTree(TreeNode node, int[] preorder, int preStart, int preEnd,
            int[] inorder, int inStart, int inEnd) {
        node.val = preorder[preStart];
        if (preStart == preEnd) {
            return;
        }
        int indexInorder = findIndexInorder(inorder, preorder[preStart], inStart);
        // 左子树的大小
        int leftSize = indexInorder - inStart;

        if (inStart <= indexInorder - 1) {
            node.left = new TreeNode();
            buildTree(node.left, preorder, preStart + 1, preStart + leftSize,
                inorder, inStart, indexInorder - 1);
        }
        if (indexInorder + 1 <= inEnd) {
            node.right = new TreeNode();
            buildTree(node.right, preorder, preStart + leftSize + 1, preEnd,
                    inorder, indexInorder + 1, inEnd);
        }
    }

    public int findIndexInorder(int[] inorder, int value, int start) {
        for (int i = start; i < inorder.length; i++) {
            if (inorder[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
