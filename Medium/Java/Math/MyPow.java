class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0) {
            n = -n; x = 1 / x;
        }
        double res = (n % 2 == 0)? myPow(x * x, n / 2): x * myPow(x * x, n / 2);
        return (res < Integer.MAX_VALUE && res > Integer.MIN_VALUE)? res: 0;
    }
}
