public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0, bit = 0;
        while (bit != 32) {
            res <<= 1;
            res += n & 1;
            n >>>= 1;
            bit ++;
        }
        return res;
    }
}
