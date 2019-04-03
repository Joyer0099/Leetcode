class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] res = new int[]{-1, -1};
        
        //         method 1
        //         while (left <= right) {
        //             int mid = (left + right) / 2;
        //             if (nums[mid] == target) {
        //                 res[0] = mid; res[1] = mid;
        //                 while (res[0] > left && nums[res[0] - 1] == target)
        //                     res[0] --;
        //                 while (res[1] < right && nums[res[1] + 1] == target)
        //                     res[1] ++;
        //                 break;
        
        //             }
        //             else if (nums[mid] > target)
        //                 right = mid - 1;
        //             else
        //                 left = mid + 1;
        //         }
        
        //         method 2
        //         find the left one.
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target)
                left = mid + 1;
            else right = mid;
        }
        
        //         find the right one.
        if (nums.length > 0 && nums[left] == target) {
            res[0] = left; right = nums.length - 1;
            while (left < right) {
                int mid = (left + right) / 2 + 1;
                if (nums[mid] > target)
                    right = mid - 1;
                else
                    left = mid;
            }
            res[1] = right;
        }
        return res;
    }
}
