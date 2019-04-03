class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row / 2; i ++) {
            for (int j = i; j < col - i - 1; j ++) {
                int temp = matrix[i][j];
                for (int k = 0; k < 4; k ++) {
                    int t = matrix[j][col - i - 1];
                    matrix[j][col - i - 1] = temp;
                    temp = t;
                    t = i; i = j; j = row - t - 1;
                }
            }
        }
    }
}
