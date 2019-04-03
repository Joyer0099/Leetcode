/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null && fast.next != null) {
                if (fast == slow)
                    return true;
                slow = slow.next;
                fast = fast.next;
            }
        }
        return false;
    }
}
