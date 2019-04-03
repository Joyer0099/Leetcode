class Solution(object):
    def isValidSudoku(self, board):
        """
            :type board: List[List[str]]
            :rtype: bool
            """
        
        S = set()
        
        for i in range(9):
            for j in range(9):
                num = board[i][j]
                if num != '.':
                    if (num, i/3, j/3) in S or (num, 'col', j) in S or (num, 'row', i) in S:
                        return False
                    S.add((num, i/3, j/3))
                    S.add((num, 'col', j))
                    S.add((num, 'row', i))
        
        return True
