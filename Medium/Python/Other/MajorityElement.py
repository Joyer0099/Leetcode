class Solution(object):
    def majorityElement(self, nums):
        """
            :type nums: List[int]
            :rtype: int
            """
        # method 1
        # maxTimes = 0
        # majority = nums[0]
        # for number in set(nums):
        #     if nums.count(number) > maxTimes:
        #         majority = number
        # return majority
        
        # method 2
        nums.sort()
        left, right = 0, len(nums) / 2 - 1
        majority = nums[0]
        while right < len(nums):
            if nums[left] == nums[right]:
                right += 1
                majority = nums[left]
            else:
                left += 1
                right += 1
        return majority
