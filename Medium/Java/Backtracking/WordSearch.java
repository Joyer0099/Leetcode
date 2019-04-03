class Solution {
    public boolean exist(char[][] board, String word) {
        if (board.length != 0)
            for (int i = 0; i < board.length; i ++)
                for (int j = 0; j < board[i].length; j ++)
                    if (backtrack(board, word, i, j , 0))
                        return true;
        return false;
    }
    
    public boolean backtrack(char[][] board, String word, int x, int y, int start) {
        if (start == word.length())
            return true;
        if (x < 0 || x >= board.length
            || y < 0 || y >= board[x].length
            || board[x][y] != word.charAt(start))
            return false;
        board[x][y] ^= 256;
        boolean res =  backtrack(board, word, x + 1, y, start + 1)
        || backtrack(board, word, x - 1, y, start + 1)
        || backtrack(board, word, x, y + 1, start + 1)
        || backtrack(board, word, x, y - 1, start + 1);
        board[x][y] ^= 256;
        return res;
    }
}
