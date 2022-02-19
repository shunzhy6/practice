package complete.leetcode36;

import java.util.HashSet;
import java.util.Set;

/**
 * 请你判断一个9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 *
 * 数字1-9在每一行只能出现一次。
 * 数字1-9在每一列只能出现一次。
 * 数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。（请参考示例图）
 *
 * 注意：
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 空白格用'.'表示。
 *
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-13
 */
public class Leetcode36 {

    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>(9);

        return isValidSudokuColumn(board, set, 0)
                && isValidSudokuLine(board, set, 0)
                && isValidSudokuThree(board, set);
    }

    public boolean isValidSudokuColumn(char[][] board, Set<Character> set, int column) {
        if (column > 8) {
            return true;
        }
        set.clear();
        for (int i = 0; i < 9; i++) {
            if (board[column][i] != '.' && set.contains(board[column][i])) {
                return false;
            }
            set.add(board[column][i]);
        }
        return isValidSudokuColumn(board, set, ++column);
    }

    public boolean isValidSudokuLine(char[][] board, Set<Character> set, int line) {
        if (line > 8) {
            return true;
        }
        set.clear();
        for (int i = 0; i < 9; i++) {
            if (board[i][line] != '.' && set.contains(board[i][line])) {
                return false;
            }
            set.add(board[i][line]);
        }
        return isValidSudokuLine(board, set, ++line);
    }

    public boolean isValidSudokuThree(char[][] board, Set<Character> set) {
        return isValidSudokuThree(board, set, 0, 0)
                && isValidSudokuThree(board, set, 0, 3)
                && isValidSudokuThree(board, set, 0, 6)
                && isValidSudokuThree(board, set, 3, 0)
                && isValidSudokuThree(board, set, 3, 3)
                && isValidSudokuThree(board, set, 3, 6)
                && isValidSudokuThree(board, set, 6, 0)
                && isValidSudokuThree(board, set, 6, 3)
                && isValidSudokuThree(board, set, 6, 6);
    }

    public boolean isValidSudokuThree(char[][] board, Set<Character> set, int x, int y) {
        if (y > 8) {
            return true;
        }
        set.clear();

        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (board[i][j] != '.' && set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        return true;
    }

}
