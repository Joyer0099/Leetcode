class Solution(object):
    def searchRange(self, nums, target):
        """
            :type nums: List[int]
            :type target: int
            :rtype: List[int]
            """
        try:
            left = nums.index(target)
            right = len(nums) - 1 - nums[::-1].index(target)
        except:
            return [-1, -1]
        return [left, right]
