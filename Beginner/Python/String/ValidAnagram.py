class Solution(object):
    def isAnagram(self, s, t):
        """
            :type s: str
            :type t: str
            :rtype: bool
            """
        dc = collections.Counter(s)
        dt = collections.Counter(t)
        
        return dc == dt
