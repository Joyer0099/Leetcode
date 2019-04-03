class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
            :type head: ListNode
            :type n: int
            :rtype: ListNode
            """
        # method 1 count the sum
        p = head
        count = 0
        while p:
            count += 1
            p = p.next
        
        if count == n:
            return head.next
        
        p = head
        if n == 1:
            while p.next.next:
                p = p.next
            p.next = None
            return head
        
        for _ in range(count - n):
            p = p.next
        p.val = p.next.val
        p.next = p.next.next
        return head
        
        # method 2 one pass
        slow = fast = head
        # The gap between slow and fast is n-1
        for _ in range(n):
            fast = fast.next
            if fast == None:
                return head.next
        while fast.next:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return head
