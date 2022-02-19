package complete.leetcode54;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 * 给你一个 m 行 n 列的矩阵matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 *
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 *
 * 示例 2：
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * 提示：
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-17
 */
public class Leetcode54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int x = 0;
        int y = matrix[0].length;
        int z = matrix.length;
        while (x < y && x < z) {
            for (int i = x; i < y; i++) {
                result.add(matrix[x][i]);
            }
            for (int i = x + 1; i < z; i++) {
                result.add(matrix[i][y - 1]);
            }
            for (int i = y - 2; i >= x && x != z - 1 && x != y - 1; i--) {
                result.add(matrix[z - 1][i]);
            }
            for (int i = z - 2; i > x && x != z - 1 && x != y - 1; i--) {
                result.add(matrix[i][x]);
            }

            x++;
            y--;
            z--;
        }
        return result;
    }

}
