/* The isBadVersion API is defined in the parent class VersionControl.
 boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid))
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }
    
    //     Stack Overflow
    // public int checker(int first, int last) {
    //     int mid = (first + last) / 2;
    //     if (isBadVersion(mid)) {
    //         if (!isBadVersion(mid - 1))
    //             return mid;
    //         return checker(first, mid - 1);
    //     }
    //     return checker(mid + 1, last);
    // }
}
