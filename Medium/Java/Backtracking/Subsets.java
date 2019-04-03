class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // backtrack(res, new ArrayList<Integer>(), nums);
        backtrack(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    
    //     first version
    // public void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums) {
    //     res.add(new ArrayList<>(temp));
    //     for (int i = 0; i < nums.length; i ++) {
    //         if (!temp.contains(nums[i])) {
    //             temp.add(nums[i]);
    //             int[] t = new int[nums.length - i];
    //             for (int j = 0; j < t.length; j ++)
    //                 t[j] = nums[j + i];
    //             backtrack(res, temp, t);
    //             temp.remove(temp.size() - 1);
    //         }
    //     }
    // }
    
    //     update
    public void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i ++) {
            if (!temp.contains(nums[i])) {
                temp.add(nums[i]);
                backtrack(res, temp, nums, i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
