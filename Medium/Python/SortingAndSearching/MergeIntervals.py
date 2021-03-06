# Definition for an interval.
# class Interval(object):
#     def __init__(self, s=0, e=0):
#         self.start = s
#         self.end = e

class Solution(object):
    def merge(self, intervals):
        """
            :type intervals: List[Interval]
            :rtype: List[Interval]
            """
        if len(intervals) == 0:
            return []
        intervals = sorted(intervals, lambda x, y: cmp(x.start, y.start))
        res = [intervals[0]]
        for interval in intervals[1:]:
            if interval.start <= res[-1].start:
                res[-1].start = interval.start
                res[-1].end = max(interval.end, res[-1].end)
            elif interval.start <= res[-1].end:
                res[-1].end = max(interval.end, res[-1].end)
            else:
                res.append(interval)
        return res
