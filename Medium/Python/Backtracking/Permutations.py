class Solution(object):
    def permute(self, nums):
        """
            :type nums: List[int]
            :rtype: List[List[int]]
            """
        results = [[]]
        for num in nums:
            newResults = []
            for result in results:
                for i in xrange(len(result) + 1):
                    newResults.append(result[:i] + [num] + result[i:])
            results = newResults
        return results
