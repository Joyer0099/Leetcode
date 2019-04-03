class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length >= 3)
            for (int i = 0; i <= nums.length / 2; i ++)
                if (nums[i] == nums[i + nums.length / 2])
                    return nums[i];
        return nums[0];
    }
}
