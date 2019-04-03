class Solution(object):
    def sortColors(self, nums):
        """
            :type nums: List[int]
            :rtype: void Do not return anything, modify nums in-place instead.
            """
        if not nums:
            return
        pos = pos0 = 0
        pos2 = len(nums) - 1
        if nums[pos] == 0:
            pos = pos0 = 1
        while pos <= pos2:
            if nums[pos] == 0:
                nums[pos0], nums[pos] = nums[pos], nums[pos0]
                pos0 += 1
            if nums[pos] == 2:
                nums[pos2], nums[pos] = nums[pos], nums[pos2]
                pos2 -= 1
            else:
                pos += 1
