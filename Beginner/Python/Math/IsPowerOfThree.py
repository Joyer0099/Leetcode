import math
class Solution(object):
    def isPowerOfThree(self, n):
        """
            :type n: int
            :rtype: bool
            """
        # loop function
        # if n < 1:
        #     return False
        # while n != 1:
        #     if n % 3 != 0:
        #         return False
        #     n /= 3
        # return True
        
        # no loop function
        # 1162261467 is 3^19,  3^20 is bigger than int
        return n > 0 and 1162261467 % n == 0
