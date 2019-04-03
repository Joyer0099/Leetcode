/*
 // Definition for a Node.
 class Node {
 public int val;
 public Node next;
 public Node random;
 
 public Node() {}
 
 public Node(int _val,Node _next,Node _random) {
 val = _val;
 next = _next;
 random = _random;
 }
 };
 */
class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node newHead = new Node(0, null, null);
        Node p = head, pn = newHead;
        while (p != null) {
            pn.next = new Node(p.val, null, null);
            map.put(p, pn.next);
            pn = pn.next; p = p.next;
        }
        p = head; pn = newHead.next;
        while (p != null) {
            pn.random = map.get(p.random);
            pn = pn.next; p = p.next;
        }
        return newHead.next;
    }
}
