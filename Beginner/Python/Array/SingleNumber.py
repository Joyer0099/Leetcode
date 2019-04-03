class Solution(object):
    def singleNumber(self, nums):
        """
            :type nums: List[int]
            :rtype: int
            """
        nums = sorted(nums)
        i = 0
        while i < len(nums) - 1:
            if nums[i] == nums[i+1]:
                i += 2
            else:
                break
        return nums[i]
