# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
            :type head: ListNode
            :rtype: bool
            """
        
        # Find the mid of this list: slow is the mid
        slow = fast = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        
        # Reverse this list
        head2 = None
        while slow:
            nxt = slow.next
            slow.next = head2
            head2 = slow
            slow = nxt
        
        while head2:
            if head2.val != head.val:
                return False
            head = head.next
            head2 = head2.next
        return True
