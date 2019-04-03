class Solution {
    public int hammingDistance(int x, int y) {
        //         method 1
        // int count = 0;
        // int res = x ^ y;
        // while (res != 0) {
        //     count += res & 1;
        //     res >>>= 1;
        // }
        // return count;
        
        //         method 2
        return Integer.bitCount(x ^ y);
    }
}
