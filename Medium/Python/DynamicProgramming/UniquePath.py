class Solution(object):
    def uniquePaths(self, m, n):
        """
            :type m: int
            :type n: int
            :rtype: int
            """
        # Timeout method
        #         if m < 1 or n < 1:
        #             return 0
        #         if n == 1 or m == 1:
        #             return 1
        #         downStep = self.uniquePaths(m, n - 1)
        #         rightStep = self.uniquePaths(m - 1, n)
        #         return downStep + rightStep
        
        # Math combination method
        # return math.factorial(m + n - 2) / math.factorial(m - 1) / math.factorial(n - 1)
        
        # Dynamic Programming
        res = [[1 for _ in range(n)] for _ in range(m)]
        for i in range(1, m):
            for j in range(1, n):
                res[i][j] = res[i][j - 1] + res[i - 1][j]
        return res[-1][-1]
