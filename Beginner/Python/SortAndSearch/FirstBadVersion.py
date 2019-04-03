# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        """
            :type n: int
            :rtype: int
            """
        # Timeout method
        # fast = slow = n
        # while isBadVersion(fast) and isBadVersion(slow):
        #     fast -= 2
        #     slow -= 1
        # while not isBadVersion(fast) and isBadVersion(slow):
        #     fast -= 1
        #     slow -= 1
        # return fast if isBadVersion(fast) else slow + 1
        
        # Find the first True
        class Wrap:
            def __getitem__(self, i):
                return isBadVersion(i)
        return bisect.bisect(Wrap(), False, 0, n)
