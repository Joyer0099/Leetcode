class Solution(object):
    def myPow(self, x, n):
        """
            :type x: float
            :type n: int
            :rtype: float
            """
        if n == 0:
            return 1
        return self.myPow(1/x, -n) if n < 0 else x ** n
