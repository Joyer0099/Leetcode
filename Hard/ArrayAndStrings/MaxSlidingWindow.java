class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k <= 0)
            return new int[0];
        int[] res = new int[nums.length - k + 1];
        int[] leftMax = new int[nums.length];
        int[] rightMax = new int[nums.length];
        for (int i = 0; i < leftMax.length; i ++)
            leftMax[i] = i % k == 0? nums[i]: Math.max(nums[i], leftMax[i - 1]);
        for (int i = rightMax.length - 1; i >= 0; i --)
            rightMax[i] = i % k == k - 1 || i == rightMax.length - 1?
            nums[i]: Math.max(nums[i], rightMax[i + 1]);
        for (int i = 0; i < res.length; i ++)
            res[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
        return res;
    }
}
