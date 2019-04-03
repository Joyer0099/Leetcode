class Solution(object):
    def isHappy(self, n):
        """
            :type n: int
            :rtype: bool
            """
        res = set()
        while n != 1:
            n = sum([int(num) ** 2 for num in str(n)])
            if n in res:
                return False
            res.add(n)
        return True
