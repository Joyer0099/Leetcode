class Solution(object):
    def generateParenthesis(self, n):
        """
            :type n: int
            :rtype: List[str]
            """
        if n == 0:
            return []
        left = right = n
        result = []
        self.dfs(left, right, result, '')
        return result
    
    def dfs(self, left, right, result, s):
        if right < left:
            return
        if right == 0 and left == 0:
            result.append(s)
            return
        if left > 0:
            self.dfs(left - 1, right, result, s + '(')
        if right > 0:
            self.dfs(left, right - 1, result, s + ')')
