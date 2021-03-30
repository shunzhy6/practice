package newcode15;

import base.TreeNode;

import java.util.ArrayList;

/**
 * 给定一个二叉树，返回该二叉树层序遍历的结果，（从左到右，一层一层地遍历）
 * 例如：
 * 给定的二叉树是{3,9,20,#,#,15,7},
 *
 * 该二叉树层序遍历的结果是
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 *
 * 示例1
 * 输入
 * {1,2}
 * 返回值
 * [[1],[2]]
 * 示例2
 * 输入
 * {1,2,3,4,#,#,5}
 * 返回值
 * [[1],[2,3],[4,5]]
 * @author zhengyingshun
 * @date 2021/3/28 19:43
 */
public class NC15 {

    private ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        this.addLevel(root, 0);
        return lists;
    }

    private void addLevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (lists.size() <= level) {
            lists.add(new ArrayList<>());
        }

        lists.get(level).add(root.val);

        level++;
        this.addLevel(root.left, level);
        this.addLevel(root.right, level);
    }

}
