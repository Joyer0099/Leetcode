/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode ph = head;
        int count = 1;
        while (count != 0) {
            count = 0;
            ListNode p = null;
            int pos = 0;
            for (int i = 0; i < lists.length; i ++)
                if (lists[i] != null) {
                    if (p == null || lists[i].val < p.val) {
                        p = lists[i]; pos = i;
                    }
                    count ++;
                }
            ph.next = p; ph = ph.next;
            if (count != 0)
                lists[pos] = lists[pos].next;
        }
        return head.next;
    }
}
