package complete.leetcode106;

import org.junit.Test;

import base.TreeNode;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-05-17
 */
public class Leetcode106Test {

    Leetcode106 leetcode106 = new Leetcode106();

    @Test
    public void buildTree1() {
        TreeNode head = leetcode106.buildTree(new int[] {9,3,15,20,7}, new int[] {9,15,7,20,3});
    }
}