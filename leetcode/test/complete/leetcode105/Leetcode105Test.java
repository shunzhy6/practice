package complete.leetcode105;

import java.util.List;

import org.junit.Test;

import base.TreeNode;
import complete.leetcode144.Leetcode144;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-05-17
 */
public class Leetcode105Test {

    private Leetcode105 leetcode105 = new Leetcode105();
    Leetcode144 leetcode144 = new Leetcode144();
    @Test
    public void buildTree1() {
        TreeNode head = leetcode105.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7});
        List<Integer> list = leetcode144.preorderTraversal(head);
        System.out.println(list);
    }

    @Test
    public void buildTree2() {
        TreeNode head = leetcode105.buildTree(new int[] {1,2,4,7,3,5,6,8}, new int[] {4,7,2,1,5,3,8,6});
        List<Integer> list = leetcode144.preorderTraversal(head);
        System.out.println(list);
    }

    @Test
    public void buildTree3() {
        TreeNode head = leetcode105.buildTree(new int[] {-1}, new int[] {-1});
        List<Integer> list = leetcode144.preorderTraversal(head);
        System.out.println(list);
    }

    @Test
    public void buildTree4() {
        TreeNode head = leetcode105.buildTree(new int[] {1,2,3}, new int[] {3,2,1});
        List<Integer> list = leetcode144.preorderTraversal(head);
        System.out.println(list);
    }

    @Test
    public void buildTree5() {
        TreeNode head = leetcode105.buildTree(new int[] {1,2,3}, new int[] {2,3,1});
        List<Integer> list = leetcode144.preorderTraversal(head);
        System.out.println(list);
    }

    @Test
    public void buildTree6() {
        TreeNode head = leetcode105.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7});
        List<Integer> list = leetcode144.preorderTraversal(head);
        System.out.println(list);
    }

}