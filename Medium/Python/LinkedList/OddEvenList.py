# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def oddEvenList(self, head):
        """
            :type head: ListNode
            :rtype: ListNode
            """
        if head == None:
            return None
        odd = head
        even = head.next
        while even != None and even.next != None:
            odd.next, even.next.next, even.next = even.next, odd.next, even.next.next
            even = even.next
            odd = odd.next
        return head
