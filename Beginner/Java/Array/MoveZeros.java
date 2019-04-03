class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                if (nums[pos] == 0) {
                    nums[pos ++] = nums[i];
                    nums[i] = 0;
                }
                else
                    pos ++;
            }
        }
    }
}
