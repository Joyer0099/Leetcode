class Solution(object):
    def moveZeroes(self, nums):
        """
            :type nums: List[int]
            :rtype: void Do not return anything, modify nums in-place instead.
            """
        nums[:] = sorted(nums, lambda x, y: -1 if y == 0 else 0)
