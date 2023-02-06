class Solution {
    private boolean isSafe(int row, int col, char[][] board) {
        for(int j = 0; j < board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }
        for(int j = 0; j < board[0].length; j++) {
            if(board[j][col] == 'Q') {
                return false;
            }
        }
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for(int c = col; c < board.length && r >= 0; c++,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for(int c = col; c >= 0 && r < board.length; c--,r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for(int c = col; c < board.length && r < board.length; c++,r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }
    private void saveBoard(char[][] board, List<List<String>> chessBoard) {
        String row = "";
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            row = "";
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 'Q') {
                    row += 'Q';
                }else {
                    row += '.';
                }
            }
            ans.add(row);
        }
        chessBoard.add(ans);
    }
    private void helper(char[][] board, List<List<String>> chessBoard, int col) {
        if(col == board.length) {
            saveBoard(board, chessBoard);
            return;
        }
        for(int row = 0; row < board.length; row++) {
            if(isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, chessBoard, col + 1);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> chessBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, chessBoard, 0);
        return chessBoard;
    }
}
