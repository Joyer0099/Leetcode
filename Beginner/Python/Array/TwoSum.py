class Solution(object):
    def twoSum(self, nums, target):
        """
            :type nums: List[int]
            :type target: int
            :rtype: List[int]
            """
        L = []
        for index1, number1 in enumerate(nums):
            for index2, number2 in enumerate(nums):
                if number1 + number2 == target and index1 != index2:
                    L.append(index1)
                    L.append(index2)
                    return L
        return L
