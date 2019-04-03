class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = true;
        for(int i = digits.length - 1; i >= 0 && carry; i --) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i] += 1;
                carry = false;
            }
        }
        if (!carry)
            return digits;
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
