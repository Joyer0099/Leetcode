void rotate(int** matrix, int matrixRowSize, int *matrixColSizes) {
    for (int i = 0; i < matrixRowSize / 2; i ++) {
        for (int j = i; j < *(matrixColSizes) - i - 1; j ++) {
            int temp = matrix[i][j];
            for (int k = 0; k < 4; k ++) {
                int t = matrix[j][*(matrixColSizes) - i - 1];
                matrix[j][*(matrixColSizes) - i - 1] = temp;
                temp = t;
                t = i; i = j; j = matrixRowSize - t - 1;
            }
        }
    }
}
