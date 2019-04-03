# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        """
            :type root: TreeNode
            :rtype: List[int]
            """
        # Recursion
        # L = []
        # if not root:
        #     return L
        # if root.left != None:
        #     L += self.inorderTraversal(root.left)
        # L.append(root.val)
        # if root.right != None:
        #     L += self.inorderTraversal(root.right)
        # return L
        
        # Iteration
        result, stack = [], [(root, False)]
        while stack:
            node, tag = stack.pop()
            if node:
                if tag:
                    result.append(node.val)
                else:
                    stack.append((node.right, False))
                    stack.append((node, True))
                    stack.append((node.left, False))
        return result
