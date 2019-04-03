class Solution(object):
    def searchMatrix(self, matrix, target):
        """
            :type matrix: List[List[int]]
            :type target: int
            :rtype: bool
            """
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        if target < matrix[0][0] or target > matrix[-1][-1]:
            return False
        for i in xrange(len(matrix)):
            try:
                matrix[i].index(target)
                return True
            except:
                x = 'nothing'
        return False
