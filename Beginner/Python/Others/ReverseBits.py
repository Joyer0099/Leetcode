class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        #  zfill() 方法返回指定长度的字符串，原字符串右对齐，前面填充0
        return int(bin(n)[2:].zfill(32)[::-1], 2)
