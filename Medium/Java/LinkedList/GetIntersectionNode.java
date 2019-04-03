/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //         set method
        // Set<ListNode> set = new HashSet<>();
        // while (headA != null) {
        //     set.add(headA);
        //     headA = headA.next;
        // }
        // while (headB != null) {
        //     if (!set.add(headB))
        //         return headB;
        //     headB = headB.next;
        // }
        //  return null;
        
        //         count method
        int ca = 0, cb = 0;
        ListNode pa = headA, pb = headB;
        while (pa != null) {
            ca ++; pa = pa.next;
        }
        while (pb != null) {
            cb ++; pb = pb.next;
        }
        if (ca < cb) {
            int temp = ca;
            ca = cb; cb = temp;
            ListNode p = headA;
            headA = headB; headB = p;
        }
        for (int i = 0; i < (ca - cb); i ++)
            headA = headA.next;
        while (headA != null) {
            if (headA == headB)
                return headA;
            headA = headA.next; headB = headB.next;
        }
        return null;
    }
}
