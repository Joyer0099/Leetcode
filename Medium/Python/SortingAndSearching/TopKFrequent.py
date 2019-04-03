class Solution(object):
    def topKFrequent(self, nums, k):
        """
            :type nums: List[int]
            :type k: int
            :rtype: List[int]
            """
        return [num[0] for num in collections.Counter(nums).most_common(k)]
