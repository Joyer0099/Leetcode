class Solution(object):
    def letterCombinations(self, digits):
        """
            :type digits: str
            :rtype: List[str]
            """
        d = {'2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl',
            '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}
        if len(digits) == 0:
            return []
        if len(digits) == 1:
            return list(d[digits[0]])
        pre = self.letterCombinations(digits[:-1])
        addition = d[digits[-1]]
        return [s + c for s in pre for c in addition]
