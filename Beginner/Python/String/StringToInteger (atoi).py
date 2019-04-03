class Solution(object):
    def myAtoi(self, s):
        """
            :type str: str
            :rtype: int
            """
        L = list(s.strip())
        if len(L) == 0:
            return 0
        negative = -1 if L[0] == '-' else 1
        if L[0] in ['-', '+']:
            del L[0]
        ret, i = 0, 0
        while i < len(L) and L[i].isdigit():
            ret = ret * 10 + ord(L[i]) - ord('0')
            i += 1
        return max(-2**31, min(negative * ret, 2**31 - 1))
