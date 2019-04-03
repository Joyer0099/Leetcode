class Solution {
    public int[] twoSum(int[] nums, int target) {
        //         method 1
        // int[] res = new int[2];
        // for (int i = 0; i < nums.length; i ++)
        //     for (int j = i + 1; j < nums.length; j ++) {
        //         if (nums[i] + nums[j] == target) {
        //             res[0] = i; res[1] = j;
        //             return res;
        //         }
        //     }
        // return res;
        
        //         method 2
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}
