class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
            :type s: str
            :rtype: int
            """
        start = maxLength = 0
        d = {}
        
        for i in range(len(s)):
            if s[i] in d and start <= d[s[i]]:
                start = d[s[i]] + 1
            else:
                maxLength = max(maxLength, i - start + 1)
            d[s[i]] = i
        
        return maxLength
