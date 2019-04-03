/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode p = res;
        while (l1 != null || l2 != null) {
            int l1val = 0, l2val = 0;
            if (l1 != null)
                l1val = l1.val;
            if (l2 != null)
                l2val = l2.val;
            int temp = l1val + l2val + carry;
            if (temp >= 10) {
                temp -= 10;
                carry = 1;
            }
            else
                carry = 0;
            p.next = new ListNode(temp);
            p = p.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry == 1)
            p.next = new ListNode(1);
        return res.next;
    }
}
