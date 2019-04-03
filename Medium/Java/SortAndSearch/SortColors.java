class Solution {
    public void sortColors(int[] nums) {
        int p = 0, p0 = 0, p2 = nums.length - 1;
        while (p <= p2) {
            if (nums[p] == 0) {
                if (p == p0)
                    p ++;
                else {
                    nums[p] = nums[p0];
                    nums[p0] = 0;
                }
                p0 ++;
            }
            else if (nums[p] == 2) {
                nums[p] = nums[p2];
                nums[p2 --] = 2;
            }
            else if (nums[p] == 1)
                p ++;
        }
    }
}
