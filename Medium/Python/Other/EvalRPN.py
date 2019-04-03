class Solution(object):
    def evalRPN(self, tokens):
        """
            :type tokens: List[str]
            :rtype: int
            """
        stack = []
        for t in tokens:
            if t in '+-*/':
                n1 = stack.pop()
                n2 = stack.pop()
                if t == '-':
                    n1 = n2 - n1
                elif t == '+':
                    n1 = n2 + n1
                elif t == '/':
                    if n2 * n1 < 0 and n2 % n1 != 0:
                        n1 = n2 / n1 + 1
                    else:
                        n1 = n2 / n1
                elif t == '*':
                    n1 = n2 * n1
                stack.append(n1)
            else:
                stack.append(int(t))
        return stack[-1]
