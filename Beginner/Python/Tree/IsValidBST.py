# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isValidBST(self, root):
        """
            :type root: TreeNode
            :rtype: bool
            """
        return self.helper(root, float("-inf"), float("inf"))
    
    def helper(self, root, left, right):
        if root == None:
            return True
        elif not left < root.val < right:
            return False
        else:
            return self.helper(root.left, left, root.val) and self.helper(root.right, root.val, right)
