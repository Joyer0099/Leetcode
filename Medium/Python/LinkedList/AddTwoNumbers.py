# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
            :type l1: ListNode
            :type l2: ListNode
            :rtype: ListNode
            """
        # elegant version
        carry = 0
        root = n = ListNode(0)
        while l1 or l2 or carry:
            v1 = v2 = 0
            if l1:
                v1 = l1.val
                l1 = l1.next
            if l2:
                v2 = l2.val
                l2 = l2.next
            carry, val = divmod(v1 + v2 + carry, 10)
            n.next = ListNode(val)
            n = n.next
        return root.next

        # ugly
#         if not l1 or not l2:
#             return l1 if l1 else l2

#         carry = False
#         result = ListNode(l1.val + l2.val)
#         if result.val >= 10:
#             result.val -= 10
#             carry = True
#         p = result; p1 = l1.next; p2 = l2.next

#         while p1 and p2:
#             p.next = ListNode(p1.val + p2.val)
#             p = p.next
#             p1 = p1.next
#             p2 = p2.next
#             if carry:
#                 p.val += 1
#             if p.val >= 10:
#                 p.val -= 10
#                 carry = True
#             else:
#                 carry = False

#         if p1:
#             p.next = p1
#         if p2:
#             p.next = p2
#         while carry:
#             if p.next == None:
#                 p.next = ListNode(1)
#                 carry = False
#             else:
#                 p = p.next
#                 p.val += 1
#                 if p.val >= 10:
#                     p.val -= 10
#                     carry = True
#                 else:
#                     carry = False

#         return result
