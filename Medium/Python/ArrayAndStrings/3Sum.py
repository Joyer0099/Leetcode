class Solution(object):
    def threeSum(self, nums):
        """
            :type nums: List[int]
            :rtype: List[List[int]]
            """
        nums.sort()
        result = []
        if len(nums) > 2:
            for i in range(len(nums)):
                if i > 0 and nums[i] == nums[i - 1]:
                    continue
                target = - nums[i]
                s, e = i + 1, len(nums) - 1
                while s < e:
                    if nums[s] + nums[e] == target:
                        result.append([nums[i], nums[s], nums[e]])
                        s += 1
                        while s < e and nums[s] == nums[s - 1]:
                            s += 1
                    elif nums[s] + nums[e] < target:
                        s += 1
                    else:
                        e -= 1
        return result
