class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstHasZero = false;
        //         make all rows which have zero become zero rows except first row
        //         and moving all the zero into the first row
        for (int i = 0; i < matrix.length; i ++) {
            boolean rowHasZero = false;
            for (int j = 0; j < matrix[i].length; j ++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        firstHasZero = true;
                    else {
                        rowHasZero = true;
                        matrix[0][j] = 0;
                    }
                }
            }
            if (rowHasZero) {
                int pos = 0;
                while (pos < matrix[i].length)
                    matrix[i][pos ++] = 0;
            }
        }
        //         make all columns which have zero become zero columns accroding to the first row
        for (int j = 0; j < matrix[0].length; j ++) {
            if (matrix[0][j] == 0)
                for (int i = 1; i < matrix.length; i ++)
                    matrix[i][j] = 0;
        }
        //         make the first row become the zero row if it has zero
        if (firstHasZero)
            for (int j = 0; j < matrix[0].length; j ++)
                matrix[0][j] = 0;
    }
}
