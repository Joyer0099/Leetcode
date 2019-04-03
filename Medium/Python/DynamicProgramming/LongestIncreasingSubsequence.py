class Solution(object):
    def lengthOfLIS(self, nums):
        """
            :type nums: List[int]
            :rtype: int
            """
        maxLength = [1 for _ in range(len(nums))]
        for i in range(len(nums) - 2, -1, -1):
            for j in range(i + 1, len(nums)):
                if nums[i] < nums[j]:
                    maxLength[i] = max(maxLength[i], maxLength[j] + 1)
        return max(maxLength) if nums else 0
