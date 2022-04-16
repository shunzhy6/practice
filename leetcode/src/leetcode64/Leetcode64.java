package leetcode64;

/**
 * 64. 最小路径和
 * 给定一个包含非负整数的 mxn网格grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例 1：
 * 输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
 * 输出：7
 * 解释：因为路径 1→3→1→1→1 的总和最小。
 *
 * 示例 2：
 * 输入：grid = [[1,2,3],[4,5,6]]
 * 输出：12
 *
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 200
 * 0 <= grid[i][j] <= 100
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-20
 */
public class Leetcode64 {

    public int minPathSum(int[][] grid) {
        return minPathSum(grid, grid.length - 1, grid[0].length - 1);
    }

    public int minPathSum(int[][] grid, int i, int j) {
        if (i == 0 && j == 0) {
            return grid[0][0];
        }
        if (i <= 0) {
            return grid[0][j] + minPathSum(grid, i, --j);
        }
        if (j <= 0) {
            return grid[i][0] + minPathSum(grid, --i, j);
        }
        int leftPath = minPathSum(grid, i, j - 1);
        int upPath = minPathSum(grid, i - 1, j);
        return (Math.min(leftPath, upPath)) + grid[i][j];
    }

}
