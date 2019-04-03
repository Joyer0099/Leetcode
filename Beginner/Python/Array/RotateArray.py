class Solution(object):
    def rotate(self, nums, k):
        """
            :type nums: List[int]
            :type k: int
            :rtype: void Do not return anything, modify nums in-place instead.
            """
        # method 1 slicing
         n = len(nums)
         k = k % n
         nums[:] = nums[n-k:] + nums[:n-k]
        
        # method 2 queue
         for i in range(k):
             nums.insert(0,nums[-1])
             nums.pop(-1)

        # method 3 iteration
        for i in range(k):
            nums[:] = nums[-1:] + nums[:-1]
