# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
            :type head: ListNode
            :rtype: ListNode
            """
        if head == None or head.next == None:
            return head
        
        # Iteration my method
        # p1 = head.next
        # p2 = p1.next
        # p1.next = head
        # head.next = None
        # if p2 == None:
        #     return p1
        # while p2.next:
        #     head = p2.next
        #     p2.next = p1
        #     p1 = p2
        #     p2 = head
        # p2.next = p1
        # return p
        
        # Iteration update
        # prev = None
        # while head:
        #     curr = head
        #     head = head.next
        #     curr.next = prev
        #     prev = curr
        # return prev
        
        # Recursion
        return self._reverse(head)
    
    def _reverse(self, node, prev=None):
        if not node:
            return prev
        p = node.next
        node.next = prev
        return self._reverse(p, node)
