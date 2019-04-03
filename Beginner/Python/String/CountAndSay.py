class Solution(object):
    def countAndSay(self, n):
        """
            :type n: int
            :rtype: str
            """
        buf = ["1"]
        for _ in range(n - 1):
            L = []
            i = 0
            while i < len(buf):
                count = 1
                while i != len(buf) - 1 and buf[i] == buf[i + 1]:
                    count += 1
                    i += 1
                L.append(str(count))
                L.append(buf[i])
                i += 1
            buf = L
        return ''.join(buf)
