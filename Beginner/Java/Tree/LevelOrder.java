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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            Queue<TreeNode> level = new LinkedList<>();
            level.offer(root);
            while (!level.isEmpty()) {
                int count = level.size();
                List<Integer> temp = new ArrayList<>();
                for (int i = 0; i < count; i ++) {
                    TreeNode p = level.poll();
                    temp.add(p.val);
                    if (p.left != null)
                        level.offer(p.left);
                    if (p.right != null)
                        level.offer(p.right);
                }
                res.add(temp);
            }
        }
        return res;
    }
}
