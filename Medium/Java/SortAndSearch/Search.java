class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            if ((nums[0] <= target && target < nums[mid])
                || (target < nums[mid] && nums[mid] < nums[0])
                || (nums[mid] < nums[0] && nums[0] <= target))
                end = mid - 1;
            else start = mid + 1;
            
        }
        return -1;
        
        //         amazing
        // while (start < end) {
        // int mid = (start + end) / 2;
        // if ((nums[0] > target) ^ (nums[0] > nums[mid]) ^ (target > nums[mid]))
        //     start = mid + 1;
        // else
        //     end = mid;
        // }
        // return start == end && nums[start] == target? start: -1;
    }
}
