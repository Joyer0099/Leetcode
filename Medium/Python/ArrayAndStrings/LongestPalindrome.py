class Solution(object):
    def longestPalindrome(self, s):
        """
            :type s: str
            :rtype: str
            """
        helper = ''
        result = ''
        for i in range(len(s)):
            # Find the palindromic substring like 'bab'
            helper = self.finder(s, i, i)
            if len(helper) > len(result):
                result = helper
            
            # Find the palindromic substring like 'abba'
            if i < len(s) - 1:
                helper = self.finder(s, i, i + 1)
                if len(helper) > len(result):
                    result = helper
        
    return result

    def finder(self, s, l, r):
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1
        return s[l + 1: r]
