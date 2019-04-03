class Solution(object):
    def findPeakElement(self, nums):
        """
            :type nums: List[int]
            :rtype: int
            """
        nums.insert(0, float("-inf"))
        nums.append(float("-inf"))
        for i in range(1, len(nums) - 1):
            if nums[i - 1] < nums[i] and nums[i + 1] < nums[i]:
                return i - 1
