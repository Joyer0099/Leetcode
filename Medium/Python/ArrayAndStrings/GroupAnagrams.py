class Solution(object):
    def groupAnagrams(self, strs):
        """
            :type strs: List[str]
            :rtype: List[List[str]]
            """
        # Timeout method 1
        # L = []
        # while strs:
        #     LL = [strs[0]]
        #     d = collections.Counter(strs[0])
        #     strs.pop(0)
        #     i = 0
        #     while i < len(strs):
        #         if d == collections.Counter(strs[i]):
        #             LL.append(strs[i])
        #             strs.pop(i)
        #         else:
        #             i += 1
        #     L.append(LL)
        # return L
        
        # Timeout method 2
        # L = []
        # for i in range(len(strs)):
        #     pos = 0
        #     try:
        #         while collections.Counter(strs[i]) != collections.Counter(L[pos][0]):
        #             pos += 1
        #         L[pos].append(strs[i])
        #     except:
        #         L.append([strs[i]])
        # return L
        
        d = {}
        for w in sorted(strs):
            key = tuple(sorted(w))
            d[key] = d.get(key, []) + [w]
        return d.values()
