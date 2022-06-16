package complete.leetcode124;

import base.TreeNode;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-04-16
 */
public class MaxPathSum {

    // 不能加static ？
    int maxPath = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGrain(root);

        return maxPath;
    }

    public int maxGrain(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // 跟零取大值，相当于如果为负数，则舍弃不计算到结果中
        int maxLeft = Math.max(maxGrain(root.left), 0);
        int maxRight = Math.max(maxGrain(root.right), 0);

        int maxCurr = root.val + maxLeft + maxRight;
        maxPath = Math.max(maxPath, maxCurr);

        return root.val + Math.max(maxLeft, maxRight);
    }

}
