class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length > 1) {
            int stepLeft = nums[0];
            for (int i = 0; i < nums.length; i ++) {
                if (stepLeft == 0)
                    return false;
                stepLeft = Math.max(stepLeft - 1, nums[i]);
            }
        }
        return true;
    }
}
