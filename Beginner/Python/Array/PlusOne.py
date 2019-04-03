class Solution(object):
    def plusOne(self, digits):
        """
            :type digits: List[int]
            :rtype: List[int]
            """
        num = int(''.join(map(str,digits)))
        num += 1
        L = []
        for i in reversed(range(len(str(num)))):
            L.append(num / pow(10, i))
            num %= pow(10, i)
        return L
