# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def buildTree(self, preorder, inorder):
        """
            :type preorder: List[int]
            :type inorder: List[int]
            :rtype: TreeNode
            """
        if inorder:
            pos = inorder.index(preorder.pop(0))
            root = TreeNode(inorder[pos])
            root.left = self.buildTree(preorder, inorder[0: pos])
            root.right = self.buildTree(preorder, inorder[pos + 1:])
            return root
