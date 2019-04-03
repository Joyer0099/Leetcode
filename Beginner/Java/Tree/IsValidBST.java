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
    public boolean isValidBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;
        if (isValidBST(root.left) && isValidBST(root.right)) {
            TreeNode pl = root.left;
            TreeNode pr = root.right;
            while (pl != null && pl.right != null)
                pl = pl.right;
            while (pr != null && pr.left != null)
                pr = pr.left;
            if ((pl == null || pl.val < root.val) && (pr == null || pr.val > root.val))
                return true;
        }
        return false;
    }
}
