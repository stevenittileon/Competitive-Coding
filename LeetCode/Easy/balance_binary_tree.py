class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def dfs(root):
            if root is None:
                return [True,0]
            
            left, right = dfs(root.left), dfs(root.right)
            balanced = left[0] and right[0] and abs(left[1]-right[1]) <= 1
            return [balanced ,1+max(left[1], right[1])]
            
        return dfs(root)[0]

'''
110. Balanced Binary Tree

Given a binary tree, determine if it is 
height-balanced
.
Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: true
'''