class Solution(object):
    def mySqrt(self, x):
        """
            :type x: int
            :rtype: int
            """
        if x == 1:
            return 1
        temp = x / 2
        while temp ** 2 > x:
            temp = (temp + x / temp) / 2
        return temp
