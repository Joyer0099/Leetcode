/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        for (int i = 0; i < intervals.size(); i ++) {
            Interval pre = intervals.get(i);
            if (res.isEmpty())
                res.add(new Interval(pre.start, pre.end));
            else {
                Interval last = res.get(res.size() - 1);
                if (pre.start <= last.end) {
                    last.start = Math.min(last.start, pre.start);
                    last.end = Math.max(last.end, pre.end);
                }
                else
                    res.add(new Interval(pre.start, pre.end));
            }
        }
        return res;
    }
}
