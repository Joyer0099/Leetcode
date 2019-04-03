class Solution(object):
    def fractionToDecimal(self, numerator, denominator):
        """
            :type numerator: int
            :type denominator: int
            :rtype: str
            """
        stack = []
        fractions = []
        sign = ''
        whole, remainder = divmod(abs(numerator), abs(denominator))
        if numerator * denominator < 0:
            sign = '-'
        numerator, denominator = abs(numerator), abs(denominator)
        if remainder == 0:
            return sign + str(whole)
        while remainder not in stack:
            if remainder == 0:
                return sign + str(whole) + '.' + ''.join(fractions)
            stack.append(remainder)
            f, remainder = divmod(remainder * 10, denominator)
            fractions.append(str(f))
        pos = stack.index(remainder)
        return sign + str(whole) + '.' + ''.join(fractions[:pos]) + '(' + ''.join(fractions[pos:]) + ')'
