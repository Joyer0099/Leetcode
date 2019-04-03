class Solution {
    public int missingNumber(int[] nums) {
        //         math method
        // int missing = nums.length * (nums.length + 1) / 2;
        // for (int num: nums)
        //     missing -= num;
        // return missing;
        
        //         xor method
        int res = nums.length;
        for (int i = 0; i < nums.length; i ++)
            res ^= nums[i] ^ i;
        return res;
    }
}
