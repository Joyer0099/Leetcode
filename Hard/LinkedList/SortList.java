/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = new ListNode(Integer.MIN_VALUE), pn;
        while (head != null) {
            pn = newHead;
            while (pn.next != null && head.val > pn.next.val)
                pn = pn.next;
            ListNode temp = pn.next;
            pn.next = head; head = head.next;
            pn.next.next = temp;
        }
        return newHead.next;
    }
}
