class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int half = a ^ b;
            int carry = (a & b) << 1;
            a = half; b = carry;
        }
        return a;
    }
}
