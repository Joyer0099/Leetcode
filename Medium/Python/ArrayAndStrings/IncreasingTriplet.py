class Solution(object):
    def increasingTriplet(self, nums):
        """
            :type nums: List[int]
            :rtype: bool
            """
        L = [float("inf"), float("inf"), float("inf")]
        if len(nums) >= 3:
            for i in range(len(nums)):
                if nums[i] < L[0]:
                    L[0] = nums[i]
                elif nums[i] > L[0]:
                    if nums[i] < L[1]:
                        L[1] = nums[i]
                    elif nums[i] > L[1]:
                        return True
        return False
