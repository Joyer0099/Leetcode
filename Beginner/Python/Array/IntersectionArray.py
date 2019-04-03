class Solution(object):
    def intersect(self, nums1, nums2):
        """
            :type nums1: List[int]
            :type nums2: List[int]
            :rtype: List[int]
            """
        # method 1 use pointer
                 pos1 = pos2 = 0
                 nums1, nums2 = sorted(nums1), sorted(nums2)
                 L = []
        
                 while pos1 < len(nums1) and pos2 < len(nums2):
                     if nums1[pos1] == nums2[pos2]:
                         L.append(nums1[pos1])
                         pos1 += 1
                         pos2 += 1
                     elif nums1[pos1] > nums2[pos2]:
                         pos2 += 1
                     else:
                         pos1 += 1
        
                 while pos1 < len(nums1) and pos2 == len(nums2) - 1:
                     if nums1[pos1] == nums2[pos2]:
                         L.append(nums1[pos1])
                         break
                     elif nums1[pos1] < nums2[pos2]:
                         break
                     else:
                         pos1 += 1
        
                 while pos2 < len(nums2) and pos1 == len(nums1) - 1:
                     if nums2[pos2] == nums1[pos1]:
                         L.append(nums2[pos2])
                         break
                     elif nums2[pos2] < nums1[pos1]:
                         break
                     else:
                         pos2 += 1
        
        #simplify
                 while True:
                     try:
                         if nums1[pos1] > nums2[pos2]:
                             pos2 += 1
                         elif nums1[pos1] < nums2[pos2]:
                             pos1 += 1
                         else:
                             L.append(nums1[pos1])
                             pos1 += 1
                             pos2 += 1
                     except IndexError:
                         break
        
                 return L
        
        # method 2 use dictionary to count
                 counts = {}
                 res = []
        
                 for num in nums1:
                     # count the num's times in counts dictionary
                     # counts.get(num, 0) is ensure that if the num show up the first time return 0
                     counts[num] = counts.get(num, 0) + 1
        
                 for num in nums2:
                     if num in counts and counts[num] > 0:
                         res.append(num)
                         counts[num] -= 1
        
                 return res
        
        # method 3 use counter
        counts = collections.Counter(nums1)
        res = []
        
        for num in nums2:
            if counts[num] > 0:
                res += num,
                counts[num] -= 1
        
    return res
