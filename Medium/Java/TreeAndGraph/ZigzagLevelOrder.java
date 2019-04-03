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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            boolean odd = true;
            List<TreeNode> level = new ArrayList<>();
            level.add(root);
            while (level.size() != 0) {
                List<Integer> l = new ArrayList<>();
                if (odd) {
                    odd = false;
                    for (int i = 0; i < level.size(); i ++)
                        l.add(level.get(i).val);
                }
                else {
                    odd = true;
                    for (int i = level.size() - 1; i >= 0; i --)
                        l.add(level.get(i).val);
                }
                res.add(new ArrayList(l));
                List<TreeNode> temp = new ArrayList<>();
                for (int i = 0; i < level.size(); i ++) {
                    temp.add(level.get(i).left);
                    temp.add(level.get(i).right);
                }
                level.clear();
                for (int i = 0; i < temp.size(); i ++)
                    if (temp.get(i) != null)
                        level.add(temp.get(i));
            }
        }
        return res;
    }
}
