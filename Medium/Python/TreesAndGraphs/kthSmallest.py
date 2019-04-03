# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def kthSmallest(self, root, k):
        """
            :type root: TreeNode
            :type k: int
            :rtype: int
            """
        countl = self.countNode(root.left)
        if k <= countl:
            return self.kthSmallest(root.left, k)
        elif k > countl + 1:
            return self.kthSmallest(root.right, k - 1 - countl)
        return root.val
    
    def countNode(self, node):
        if not node:
            return 0
        return 1 + self.countNode(node.left) + self.countNode(node.right)
