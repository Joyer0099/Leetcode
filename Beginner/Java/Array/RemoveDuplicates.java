class Solution {
    public int removeDuplicates(int[] nums) {
        int size = 0, pos = 1;
        if (nums.length <= 1)
            return nums.length;
        while (pos < nums.length) {
            if (nums[size] == nums[pos])
                pos ++;
            else
                nums[++ size] = nums[pos ++];
        }
        return size + 1;
    }
}
