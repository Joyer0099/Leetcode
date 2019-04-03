/*
 // Definition for a Node.
 class Node {
 public int val;
 public Node left;
 public Node right;
 public Node next;
 
 public Node() {}
 
 public Node(int _val,Node _left,Node _right,Node _next) {
 val = _val;
 left = _left;
 right = _right;
 next = _next;
 }
 };
 */
class Solution {
    public Node connect(Node root) {
        if (root != null) {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root.left);
            queue.offer(root.right);
            int count = 2;
            while (queue.peek() != null) {
                for (int i = 0; i < count; i ++) {
                    Node node = queue.poll();
                    queue.offer(node.left);
                    queue.offer(node.right);
                    if (i != count - 1)
                        node.next = queue.peek();
                }
                count *= 2;
            }
        }
        return root;
    }
}
