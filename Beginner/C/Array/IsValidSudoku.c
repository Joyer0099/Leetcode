bool isValidSudoku(char** board, int boardRowSize, int boardColSize) {
    int row[9][9], col[9][9], block[3][3][9];
    for (int i = 0; i < 9; i ++)
        for (int j = 0; j < 9; j ++) {
            row[i][j] = 0;
            col[i][j] = 0;
            for (int k = 0; k < 9; k ++)
                block[i / 3][j / 3][k] = 0;
        }
    for (int i = 0; i < 9; i ++)
        for (int j = 0; j < 9; j ++) {
            if (board[i][j] != '.') {
                int temp = board[i][j] - 49;
                if (row[i][temp] == 1
                    || col[j][temp] == 1
                    || block[i / 3][j / 3][temp] == 1)
                    return false;
                row[i][temp] = 1;
                col[j][temp] = 1;
                block[i / 3][j / 3][temp] = 1;
            }
        }
    return true;
}
