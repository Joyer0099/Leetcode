class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's algorithm
        // int maxEndHere = nums[0], maxSoFar = nums[0];
        // for (int i = 1; i < nums.length; i ++) {
        //     maxEndHere = Math.max(nums[i], nums[i] + maxEndHere);
        //     maxSoFar = Math.max(maxEndHere, maxSoFar);
        // }
        // return maxSoFar;
        
        //         divide and conquer
        return maxSub(nums, 0, nums.length - 1);
    }
    public int maxMid(int[] nums, int start, int mid, int end) {
        int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE, midSum = 0;
        for (int i = mid; i >= start; i --) {
            midSum += nums[i];
            leftSum = Math.max(midSum, leftSum);
        }
        midSum = 0;
        for (int i = mid + 1; i <= end; i ++) {
            midSum += nums[i];
            rightSum = Math.max(midSum, rightSum);
        }
        return leftSum + rightSum;
    }
    
    public int maxSub(int[] nums, int start, int end) {
        if (start == end)
            return nums[start];
        int mid = (start + end) / 2;
        return Math.max(Math.max(maxSub(nums, start, mid), maxSub(nums, mid + 1, end)),
                        maxMid(nums, start, mid, end));
    }
}
