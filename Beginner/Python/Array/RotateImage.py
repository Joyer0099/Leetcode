class Solution(object):
    def rotate(self, matrix):
        """
            :type matrix: List[List[int]]
            :rtype: void Do not return anything, modify matrix in-place instead.
            """
        for i in range(len(matrix) / 2):
            for j in range(i, len(matrix) - i - 1):
                temp = matrix[i][j]
                for _ in range(4):
                    matrix[j][-(i + 1)], temp = temp, matrix[j][-(i + 1)]
                    i, j = j, -(i + 1)
