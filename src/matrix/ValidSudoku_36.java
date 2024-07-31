package matrix;

import java.util.HashSet;

public class ValidSudoku_36 {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char temp = board[i][j];
                if (temp != '.') {
                    if (!seen.add(temp + " at row " + i) ||
                            !seen.add(temp + " at col " + j) ||
                            !seen.add(temp + " at squar " + i / 3 + "-" + j / 3)
                    )
                        return false;
                }
            }
        }
        return true;
    }
}
