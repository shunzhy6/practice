package complete.leetcode56;

import org.junit.Test;

import base.Print;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-03-14
 */
public class Leetcode56Test {
    
    private Leetcode56 leetcode56 = new Leetcode56();

    @Test
    public void merge1() {
        int[][] result = leetcode56.merge(new int[][]{{2,6},{8,10},{1,3},{15,18}});
        Print.print(result);
    }

    @Test
    public void merge2() {
        int[][] result = leetcode56.merge(new int[][]{{2,6},{3,10},{1,3},{15,18}});
        Print.print(result);
    }

    @Test
    public void merge3() {
        int[][] result = leetcode56.merge(new int[][]{{1,4},{4,5}});
        Print.print(result); //[[1,5]]
    }


    @Test
    public void merge4() {
        int[][] result = leetcode56.merge(new int[][]{{1,4},{2,3}});
        Print.print(result); //[[1,4]]
    }

}