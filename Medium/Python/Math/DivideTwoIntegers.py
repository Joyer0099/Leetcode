class Solution(object):
    def divide(self, dividend, divisor):
        """
            :type dividend: int
            :type divisor: int
            :rtype: int
            """
        sign = m = 1
        res = 0
        if dividend * divisor < 0:
            sign = -1
        dividend, divisor = abs(dividend), abs(divisor)
        temp = divisor
        while dividend >= (temp << 1):
            temp <<= 1
            m <<= 1
        while temp >= divisor and dividend >= divisor:
            if dividend >= temp:
                dividend -= temp
                res += m
            temp >>= 1
            m >>= 1

        return min(max(- 2 ** 31, res * sign), 2 ** 31 - 1)
