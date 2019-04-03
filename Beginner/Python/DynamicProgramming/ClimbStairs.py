class Solution(object):
    def climbStairs(self, n):
        """
            :type n: int
            :rtype: int
            """
        # Timeout method recursion
        # if n == 1:
        #     return 1
        # if n == 2:
        #     return 2
        # way = self.climbStairs(n - 1) + self.climbStairs(n - 2)
        # return way
        
        # Iteration
        if n <= 2:
            return n
        ways = [0 for _ in range(n)]
        ways[0], ways[1] = 1, 2
        for i in range(2, n):
            ways[i] = ways[i - 1] + ways[i - 2]
        return ways[-1]
