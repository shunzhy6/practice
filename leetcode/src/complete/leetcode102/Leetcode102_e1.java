package complete.leetcode102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import base.TreeNode;

/**
 * 102. 二叉树的层序遍历
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-04-26
 */
public class Leetcode102_e1 {

    List<List<Integer>> levelList = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        levelOrder(root, 0);

        return levelList;
    }

    public void levelOrder(TreeNode node, int i) {
        if (node == null) {
            return;
        }

        if (levelList.size() < i + 1) {
            levelList.add(new ArrayList<>());
        }
        List<Integer> list = levelList.get(i);

        list.add(node.val);

        levelOrder(node.left, i + 1);
        levelOrder(node.right, i + 1);
    }

}
