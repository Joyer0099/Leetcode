class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set S = new HashSet();
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                char num = board[i][j];
                if (num != '.') {
                    if (!S.add(num + "in row" + i)
                        || !S.add(num + "in col" + j)
                        || !S.add(num + "in block" + i / 3 + "-" + j / 3))
                        return false;
                }
            }
        }
        return true;
    }
}
