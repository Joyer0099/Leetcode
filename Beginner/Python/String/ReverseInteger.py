class Solution(object):
    def reverse(self, x):
        """
            :type x: int
            :rtype: int
            """
        s = str(x)[::-1]
        if s[-1] == '-':
            x = int(s[-1] + s[:-1])
        else:
            x = int(s)
        if x > pow(2, 31) - 1 or x < -pow(2, 31):
            return 0
        return x
