class Solution(object):
    def maxSubArray(self, nums):
        """
            :type nums: List[int]
            :rtype: int
            """
        # Kadane's algorithm
        # max_ending_here = max_so_far = nums[0]
        # for x in nums[1:]:
        #     max_ending_here = max(x, max_ending_here + x)
        #     max_so_far = max(max_so_far, max_ending_here)
        # return max_so_far
        
        # divide and conquer
        return self.maxSubArraySum(nums, 0, len(nums)-1)
    
    def maxCrossingSum(self,arr, l, m, h) :
        sm = 0; left_sum = float("-inf")
        for i in range(m, l-1, -1) :
            sm = sm + arr[i]
            
            if (sm > left_sum) :
                left_sum = sm
        
        sm = 0; right_sum = float("-inf")
        for i in range(m + 1, h + 1) :
            sm = sm + arr[i]
            
            if (sm > right_sum) :
                right_sum = sm
        return left_sum + right_sum;

        def maxSubArraySum(self,arr, l, h) :
        if (l == h) :
            return arr[l]
        
        m = (l + h) // 2

        return max(self.maxSubArraySum(arr, l, m),
                   self.maxSubArraySum(arr, m+1, h),
                   self.maxCrossingSum(arr, l, m, h))
