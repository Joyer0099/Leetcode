// Recursion

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((inHere(root.left, p) && inHere(root.right, q))
            || (inHere(root.left, q) && inHere(root.right, p))
            || root == p || root == q)
            return root;
        if (inHere(root.left, p))
            return lowestCommonAncestor(root.left, p, q);
        return lowestCommonAncestor(root.right, p, q);
    }
    
    public boolean inHere(TreeNode root, TreeNode target) {
        if (root == null)
            return false;
        if (root == target)
            return true;
        return inHere(root.left, target) || inHere(root.right, target);
    }
}
