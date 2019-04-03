class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return false;
        int col = 0, row = matrix.length - 1;
        while (col < matrix[0].length && row >= 0) {
            if (matrix[row][col] > target)
                row --;
            else if (matrix[row][col] < target)
                col ++;
            else return true;
        }
        return false;
    }
}
