class Solution {
    // Another place method
    //     public void gameOfLife(int[][] board) {
    //         int[][] temp = new int[board.length + 2][board[0].length + 2];
    //         for (int i = 1; i <= board.length; i ++)
    //             for (int j = 1; j <= board[0].length; j ++)
    //                 temp[i][j] = board[i - 1][j - 1];
    //         for (int i = 0; i < board.length; i ++)
    //             for (int j = 0; j < board[i].length; j ++) {
    //                 int count = countOne(temp, i + 1, j + 1);
    //                 if ((temp[i + 1][j + 1] == 1 && count < 2) || (temp[i + 1][j + 1] == 1 && count > 3))
    //                     board[i][j] = 0;
    //                 else if (temp[i + 1][j + 1] == 0 && count == 3)
    //                     board[i][j] = 1;
    //                 else
    //                     board[i][j] = temp[i + 1][j + 1];
    //             }
    //     }
    
    //     public int countOne(int[][] board, int i, int j) {
    //         int count = 0;
    //         count += board[i + 1][j + 1] == 1? 1: 0;
    //         count += board[i + 1][j - 1] == 1? 1: 0;
    //         count += board[i + 1][j] == 1? 1: 0;
    //         count += board[i - 1][j + 1] == 1? 1: 0;
    //         count += board[i - 1][j - 1] == 1? 1: 0;
    //         count += board[i - 1][j] == 1? 1: 0;
    //         count += board[i][j + 1] == 1? 1: 0;
    //         count += board[i][j - 1] == 1? 1: 0;
    //         return count;
    //     }
    
    // In-place method
    // - 00  dead (next) <- dead (current) != 3
    // - 01  dead (next) <- live (current) < 2 || > 3
    // - 10  live (next) <- dead (current)  = 3
    // - 11  live (next) <- live (current) 2, 3
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return ;
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i ++)
            for (int j = 0; j < n; j ++) {
                int lives = liveNeighbors(board, m, n, i, j);
                
                // In the beginning, every 2nd bit is 0
                // So we only need to care about when will the 2nd bit become 1
                if (board[i][j] == 1 && lives >= 2 && lives <= 3)
                    board[i][j] = 3;    // Make the 2nd bit 1: 01 ---> 11
                if (board[i][j] == 0 && lives == 3)
                    board[i][j] = 2;    // Make the 2nd bit 1: 00 ---> 10
            }
        for (int i = 0; i < m; i ++)
            for (int j = 0; j < n; j ++)
                board[i][j] >>= 1;  // Get the 2nd state
    }
    
    public int liveNeighbors(int[][] board, int m, int n, int i, int j) {
        int lives = 0;
        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x ++)
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y ++)
                lives += board[x][y] & 1;
        lives -= board[i][j] & 1;
        return lives;
    }
}
