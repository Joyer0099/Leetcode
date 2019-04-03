class Solution(object):
    def isValid(self, s):
        """
            :type s: str
            :rtype: bool
            """
        # version 1
        # if len(s) == 0:
        #     return True
        # stack = []
        # stack.append(s[0])
        # for bracket in s[1:]:
        #     if bracket in ['(', '[', '{']:
        #         stack.append(bracket)
        #     elif bracket in [')', ']', '}']:
        #         if len(stack) == 0:
        #             return False
        #         if (bracket == ')' and stack[-1] == '(') or \
        #             (bracket == ']' and stack[-1] == '[') or \
        #             (bracket == '}' and stack[-1] == '{'):
        #             stack.pop(-1)
        #         else:
        #             return False
        #     else:
        #         return False
        # return len(stack) == 0
        
        # update using dict
        stack = []
        bDict = {"]":"[", "}":"{", ")":"("}
        for bracket in s:
            if bracket in bDict.values():
                stack.append(bracket)
            elif bracket in bDict.keys():
                if stack == [] or bDict[bracket] != stack.pop():
                    return False
            else:
                return False
        return stack == []
