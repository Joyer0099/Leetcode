class Solution(object):
    def subsets(self, nums):
        """
            :type nums: List[int]
            :rtype: List[List[int]]
            """
        results = [[]]
        if len(nums) != 0:
            results = self.subsets(nums[:-1])
            newResults = []
            for result in results:
                newResults.append(result + [nums[-1]])
            results.extend(newResults)
        return results
