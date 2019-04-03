/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;
        ListNode res = head;
        ListNode lastOdd = res, nextOdd = res.next;
        while (nextOdd != null && nextOdd.next != null) {
            ListNode p = lastOdd.next;
            lastOdd.next = nextOdd.next;
            nextOdd.next = lastOdd.next.next;
            lastOdd.next.next = p;
            lastOdd = lastOdd.next;
            nextOdd = nextOdd.next;
        }
        return res;
    }
}
