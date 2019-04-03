/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        
        // Devide the list into two parts. (slow is the second part's head)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null)
            slow = slow.next;
        
        // Reverse the second list.
        ListNode prev = slow.next;
        ListNode h = slow;
        while (prev != null) {
            slow.next = prev.next;
            prev.next = h;
            h = prev;
            prev = slow.next;
        }
        slow = h;
        
        // Compare them.
        while (head != null && slow != null) {
            if (head.val != slow.val)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
