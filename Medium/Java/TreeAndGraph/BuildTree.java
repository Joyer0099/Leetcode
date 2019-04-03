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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, inorder, 0, inorder.length);
    }
    
    public TreeNode build(int[] preorder, int ps, int[] inorder, int is, int ie) {
        if (is < ie) {
            TreeNode root = new TreeNode(preorder[ps]);
            int inIndex = 0;
            while (inorder[inIndex] != preorder[ps])
                inIndex ++;
            root.left = build(preorder, ps + 1, inorder, is, inIndex);
            root.right = build(preorder, ps + inIndex - is + 1, inorder, inIndex + 1, ie);
            return root;
        }
        return null;
    }
}
