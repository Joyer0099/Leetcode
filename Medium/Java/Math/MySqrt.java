class Solution {
    public int mySqrt(int x) {
        if (x <= 1)
            return x;
        int temp = x / 2;
        while (Math.pow(temp, 2) > x)
            temp = (temp + x / temp) / 2;
        return temp;
    }
}
