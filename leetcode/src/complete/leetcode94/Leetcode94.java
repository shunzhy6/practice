package complete.leetcode94;

import java.util.ArrayList;
import java.util.List;

import base.TreeNode;

/**
 * 94. 二叉树的中序遍历
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-04-27
 */
public class Leetcode94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        inorderTraversal(root, result);

        return result;
    }

    public void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

}
