class Solution(object):
    def containsDuplicate(self, nums):
        """
            :type nums: List[int]
            :rtype: bool
            """
        # Transfrom list into set
        s = set(nums)
        # Juding their length is equal or not
        return len(nums) != len(s)
