package complete.leetcode124;

import org.junit.Test;

import base.TreeNode;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-04-16
 */
public class MaxPathSumTest {

    public MaxPathSum maxPathSum = new MaxPathSum();

    @Test
    public void maxPathSum() {
        int result = maxPathSum.maxPathSum(new TreeNode(0));
        System.out.println(result);
    }


}