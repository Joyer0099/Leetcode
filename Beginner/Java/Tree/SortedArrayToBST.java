/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    
    public TreeNode helper(int[] nums, int first, int last) {
        if (first > last)
            return null;
        int mid = (first + last) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, first, mid - 1);
        root.right = helper(nums, mid + 1, last);
        return root;
    }
}
