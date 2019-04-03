class Solution(object):
    def longestCommonPrefix(self, strs):
        """
            :type strs: List[str]
            :rtype: str
            """
        if len(strs) == 0:
            return ""
        letters = list(strs[0])
        for i in range(1, len(strs)):
            if len(strs[i]) < len(letters):
                letters[:] = letters[:len(strs[i])]
            for j in range(min(len(strs[i]), len(letters))):
                if letters[j] != strs[i][j]:
                    letters[:] = letters[:j]
                    break
        return "".join(letters)
