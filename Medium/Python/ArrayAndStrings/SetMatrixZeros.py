class Solution(object):
    def setZeroes(self, matrix):
        """
            :type matrix: List[List[int]]
            :rtype: void Do not return anything, modify matrix in-place instead.
            """
        if len(matrix) == 0:
            return
        rowZero = colZero = False
        for i in range(len(matrix)):
            if matrix[i][0] == 0:
                colZero = True
                break
        for j in range(len(matrix[0])):
            if matrix[0][j] == 0:
                rowZero = True
                break
        
        for i in range(1, len(matrix)):
            for j in range(1, len(matrix[0])):
                if matrix[i][j] == 0:
                    matrix[i][0] = matrix[0][j] = 0
        
        for i in range(1, len(matrix)):
            if matrix[i][0] == 0:
                for j in range(1, len(matrix[0])):
                    matrix[i][j] = 0
for j in range(1, len(matrix[0])):
    if matrix[0][j] == 0:
        for i in range(1, len(matrix)):
            matrix[i][j] = 0
        
        if colZero:
            for i in range(len(matrix)):
                matrix[i][0] = 0
    if rowZero:
        for j in range(len(matrix[0])):
            matrix[0][j] = 0
