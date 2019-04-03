class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i ++)
            for (int j = i - 1; j >= 0; j --) {
                int temp = 1;
                if (nums[i] > nums[j])
                    temp = dp[j] + 1;
                dp[i] = Math.max(dp[i], temp);
            }
        int res = 0;
        for (int i = 0; i < dp.length; i ++)
            res = Math.max(res, dp[i]);
        return res;
    }
}
