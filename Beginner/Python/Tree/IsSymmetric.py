# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSymmetric(self, root):
        """
            :type root: TreeNode
            :rtype: bool
            """
        if not root:
            return True
        return self.helper(root.left, root.right)
    
    def helper(self, left, right):
        if left == None and right == None:
            return True
        elif left == None or right == None:
            return False
        elif left.val == right.val:
            return self.helper(left.left, right.right) and self.helper(left.right, right.left)
        return False
