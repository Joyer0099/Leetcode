public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //         method 1
        // int count = 0;
        // while (n != 0) {
        //     count += n & 1;
        //     n >>>= 1;
        // }
        // return count;
        
        //         method 2
        return Integer.bitCount(n);
    }
}
