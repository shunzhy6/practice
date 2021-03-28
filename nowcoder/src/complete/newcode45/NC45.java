package complete.newcode45;

import base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *  分别按照二叉树先序，中序和后序打印所有的节点。
 * 示例1
 * 输入
 * {1,2,3}
 * 返回值
 * [[1,2,3],[2,1,3],[2,3,1]]
 * 备注:
 * n≤10^6
*/
public class NC45 {

    /**
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders (TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        this.pre(root, pre);

        List<Integer> mid = new ArrayList<>();
        this.mid(root, mid);

        List<Integer> last = new ArrayList<>();
        this.last(root, last);

        int[][] result = new int[3][];
        result[0] = this.transTo(pre);
        result[1] = this.transTo(mid);
        result[2] = this.transTo(last);
        return result;
    }

    private int[] transTo(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    /**
     * 先(根)序遍历（根左右）：A B D H E I C F J K G
     * @author zhengyingshun
     * @date 2021/3/27 14:55
     */
    private void pre(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        this.pre(root.left, list);
        this.pre(root.right, list);
    }

    /**
     * 中(根)序遍历（左根右） : D H B E I A J F K C G
     * @author zhengyingshun
     * @date 2021/3/27 14:55
     */
    private void mid(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        this.mid(root.left, list);
        list.add(root.val);
        this.mid(root.right, list);
    }

    /**
     * 后(根)序遍历（左右根） : H D I E B J K F G C A
     * @author zhengyingshun
     * @date 2021/3/27 14:55
     */
    private void last(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        this.last(root.left, list);
        this.last(root.right, list);
        list.add(root.val);
    }

}
