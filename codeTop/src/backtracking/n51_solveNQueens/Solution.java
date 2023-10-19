package backtracking.n51_solveNQueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chess = new char[n][n];
        for (char[] c : chess) {
            Arrays.fill(c, '.');
        }
        backtracking(0, n, chess);
        return res;
    }

    public void backtracking(int row, int n, char[][] chess){
        if (row == n) {
            res.add(toList(chess));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (checkChees(row, col, chess)) {
                chess[row][col] = 'Q';
                backtracking(row + 1, n, chess);
                chess[row][col] = '.';
            }
        }
    }

    public boolean checkChees(int row, int col, char[][] chess) {
        //直线
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 'Q') return false;
        }

        //45°
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') return false;
        }

        //135°
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') return false;
        }

        return true;
    }

    public List<String> toList(char[][] chess) {
        List<String> res = new ArrayList<>();
        for (char[] c : chess) {
            res.add(String.copyValueOf(c));
        }
        return res;
    }
}
