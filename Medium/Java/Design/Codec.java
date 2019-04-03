/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        encode(res, root);
        return res.toString();
    }
    
    private void encode(StringBuilder sb, TreeNode root) {
        if (root == null)
            sb.append("#").append(" ");
        else {
            sb.append(root.val).append(" ");
            encode(sb, root.left);
            encode(sb, root.right);
        }
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(" ")));
        return decode(queue);
    }
    
    private TreeNode decode(Queue<String> queue) {
        String val = queue.poll();
        if (val.equals("#"))
            return null;
        TreeNode root = new TreeNode(Integer.valueOf(val));
        root.left = decode(queue);
        root.right = decode(queue);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
