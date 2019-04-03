class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
            :type nums1: List[int]
            :type m: int
            :type nums2: List[int]
            :type n: int
            :rtype: void Do not return anything, modify nums1 in-place instead.
            """
        nums1[:] = nums1[:m]
        nums2[:] = nums2[:n]
        pos = 0
        for number in nums2:
            while pos < len(nums1) and number > nums1[pos]:
                pos += 1
            nums1.insert(pos, number)
