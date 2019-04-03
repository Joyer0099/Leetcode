class Solution(object):
    def titleToNumber(self, s):
        """
            :type s: str
            :rtype: int
            """
        index = '#ABCDEFGHIJKLMNOPQRSTUVWXYZ'
        s = s[::-1]
        return sum([26 ** i * index.index(s[i]) for i in range(len(s))])
