/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head, r = head;
        for (int i = 0; i < n; i ++)
            r = r.next;
        if (r == null)
            head = head.next;
        else {
            while (r.next != null) {
                l = l.next; r = r.next;
            }
            l.next = l.next.next;
        }
        return head;
    }
}
