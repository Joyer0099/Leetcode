class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums.length > 2) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i ++) {
                int target = - nums[i];
                int s = i + 1, e = nums.length - 1;
                while (s < e) {
                    if (nums[s] + nums[e] == target) {
                        results.add(Arrays.asList(nums[i], nums[s], nums[e]));
                        s ++;
                        while (s < e && nums[s] == nums[s - 1])
                            s ++;
                    }
                    else if (nums[s] + nums[e] < target)
                        s ++;
                    else
                        e --;
                }
                while (i < nums.length - 1 && nums[i] == nums[i + 1])
                    i ++;
            }
        }
        return results;
    }
}
