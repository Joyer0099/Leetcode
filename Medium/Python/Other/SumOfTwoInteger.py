class Solution(object):
    def getSum(self, a, b):
        """
            :type a: int
            :type b: int
            :rtype: int
            """
        mask = 0xFFFFFFFF
        while b != 0:
            a, b = (a ^ b) & mask, ((a & b) << 1) & mask
        return a if a <= 2 ** 31 else ~(a ^ mask)
