# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
            :type head1, head1: ListNode
            :rtype: ListNode
            """
        ca = cb = 0
        pa, pb = headA, headB
        while pa:
            ca += 1; pa = pa.next
        while pb:
            cb += 1; pb = pb.next
        pa, pb = headA, headB
        if ca < cb:
            pa, pb = pb, pa
            ca, cb = cb, ca
        for i in range(ca - cb):
            pa = pa.next
        while pa and pb:
            if pa is pb:
                return pa
            pa = pa.next
            pb = pb.next
        return None
