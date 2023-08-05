class Solution {
    public boolean isSafe(char[][] board, int row, int col, int num) {
        // checking row and column
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == (char)(num + '0')) {
                return false;
            }
            if(board[row][i] == (char)(num + '0')) {
                return false;
            }
        }
        // checking the grid
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;
        for(int i = srow; i < srow + 3; i++) {
            for(int j = scol; j < scol + 3; j++) {
                if(board[i][j] == (char)(num + '0')) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean solveSudoku(char[][] board, int row, int col) {
        if(row == board.length) {
            return true;
        }

        int nrow = row;
        int ncol = col;

        if(col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        }else {
            nrow = row + 1;
            ncol = 0;
        }

        if(board[row][col] != '.') {
            if(solveSudoku(board, nrow, ncol)) {
                return true;
            }
        }else {
            for(int i = 1; i <= 9; i++) {
                if(isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i +'0');
                    if(solveSudoku(board, nrow, ncol)) {
                        return true;
                    }else {
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        solveSudoku(board, 0, 0);
    }
}
