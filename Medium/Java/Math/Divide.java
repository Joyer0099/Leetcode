class Solution {
    public int divide(int dividend, int divisor) {
        int tag = 1;
        long dd = dividend, dr = divisor;
        if (dividend < 0) {
            tag *= -1; dd = -dd;
        }
        if (divisor < 0) {
            tag *= -1; dr = -dr;
        }
        int res = 0;
        int c1 = Long.toBinaryString(dd).length();
        int c2 = Long.toBinaryString(dr).length();
        c1 -= c2;
        dr <<= c1;
        while (c1 >= 0) {
            if (Integer.toBinaryString(res).length() == 31)
                return tag > 0? Integer.MAX_VALUE: Integer.MIN_VALUE;
            res <<= 1;
            if (dd >= dr) {
                dd -= dr;
                res += 1;
            }
            dr >>>= 1;
            c1 --;
        }
        return res * tag;
    }
}
