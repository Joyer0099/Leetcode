class Solution(object):
    def generate(self, numRows):
        """
            :type numRows: int
            :rtype: List[List[int]]
            """
        if numRows <= 0:
            return []
        LL = [[1]]
        L = [1, 1]
        for i in range(1, numRows):
            LL.append(L)
            L = self.sumOfList(L)
        return LL
    
    def sumOfList(self, L):
        Lhelper = [1]
        for i in range(1, len(L)):
            Lhelper.append(L[i - 1] + L[i])
        Lhelper.append(1)
        return Lhelper
