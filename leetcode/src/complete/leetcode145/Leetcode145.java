package complete.leetcode145;

import java.util.ArrayList;
import java.util.List;

import base.TreeNode;

/**
 * 145. 二叉树的后序遍历
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-05-17
 */
public class Leetcode145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        postorderTraversal(root, result);

        return result;
    }

    public void postorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
    }

}
