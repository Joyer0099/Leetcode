// Just like count island
// First find the border 'O', change them into 'Y'
// Second change the 'O' into 'X', and change the 'Y' into 'O'

class Solution {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0)
            return ;
        for (int i = 0; i < board.length; i ++) {
            changeBorder(board, i, 0);
            changeBorder(board, i, board[i].length - 1);
        }
        for (int i = 0; i < board[0].length; i ++) {
            changeBorder(board, 0, i);
            changeBorder(board, board.length - 1, i);
        }
        
        for (int i = 0; i < board.length; i ++)
            for (int j = 0; j < board[i].length; j ++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == 'Y')
                    board[i][j] = 'O';
            }
    }
    
    public void changeBorder(char[][] board, int x, int y) {
        if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 'O') {
            board[x][y] = 'Y';
            changeBorder(board, x + 1, y);
            changeBorder(board, x - 1, y);
            changeBorder(board, x, y + 1);
            changeBorder(board, x, y - 1);
        }
    }
}
