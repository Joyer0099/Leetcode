class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int element: nums) {
            res ^= element;
        }
        return res;
    }
}
