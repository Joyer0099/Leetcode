class Solution(object):
    def leastInterval(self, tasks, n):
        """
            :type tasks: List[str]
            :type n: int
            :rtype: int
            """
        tc = collections.Counter(tasks).values()
        m = max(tc)
        mc = tc.count(m)
        return max(len(tasks), (m - 1) * (n + 1) + mc)
