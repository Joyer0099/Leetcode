class Solution(object):
    def canJump(self, nums):
        """
            :type nums: List[int]
            :rtype: bool
            """
        stepLeft = nums[0]
        if stepLeft == 0 and len(nums) > 1:
            return False
        
        for num in nums[1: -1]:
            stepLeft = max(stepLeft - 1, num)
            if stepLeft == 0:
                return False
        
    return True
