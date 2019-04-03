# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def zigzagLevelOrder(self, root):
        """
            :type root: TreeNode
            :rtype: List[List[int]]
            """
        if not root:
            return []
        result, level = [], [root]
        reverse = False
        while level:
            if reverse:
                result.append([node.val for node in level[::-1]])
                reverse = False
            else:
                result.append([node.val for node in level])
                reverse = True
            temp = []
            for node in level:
                temp.extend([node.left, node.right])
            level = [leaf for leaf in temp if leaf]
        return result
