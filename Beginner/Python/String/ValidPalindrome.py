class Solution(object):
    def isPalindrome(self, s):
        """
            :type s: str
            :rtype: bool
            """
        s = s.lower()
        head, tail = 0, len(s) - 1
        while head < tail:
            while head < tail and not s[head].isalnum():
                head += 1
            while head < tail and not s[tail].isalnum():
                tail -= 1
            if s[head] != s[tail]:
                return False
            tail -= 1
            head += 1
        return True
