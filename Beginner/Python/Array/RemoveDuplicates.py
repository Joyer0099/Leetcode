class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 0
        sum = len(nums)
        while i < sum - 1:
            if (nums[i] == nums[i+1]):
                nums.pop(i+1)
                sum -= 1
            else:
                i += 1
                
        return len(nums)