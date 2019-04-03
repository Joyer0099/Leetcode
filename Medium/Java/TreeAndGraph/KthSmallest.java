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
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = count(root.left);
        if (k <= leftCount)
            return kthSmallest(root.left, k);
        if (k == leftCount + 1)
            return root.val;
        return kthSmallest(root.right, k - leftCount - 1);
    }
    
    public int count(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + count(root.left) + count(root.right);
    }
}
