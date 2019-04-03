class Solution(object):
    def rob(self, nums):
        """
            :type nums: List[int]
            :rtype: int
            """
        # Time out method
        # if len(nums) == 0:
        #     return 0
        # if len(nums) <= 2:
        #     return max(nums)
        # return max(self.rob(nums[: -1]), self.rob(nums[: -2]) + nums[-1])
        
        # Dynamic Programming
        last, now = 0, 0
        for money in nums:
            last, now = now, max(last + money, now)
        return now
