/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 || inorder.length==0)
        {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int mid = -1;
        for(int i = 0; i<inorder.length;i++)
        {
            if(inorder[i] == preorder[0])
            {
                mid = i;
                break;
            }
        }

        int leftpreorder[] = Arrays.copyOfRange(preorder, 1, mid+1);
        int leftinorder[] = Arrays.copyOfRange(inorder, 0, mid);
        root.left = buildTree(leftpreorder, leftinorder);

        int rightpreorder[] = Arrays.copyOfRange(preorder, mid+1, preorder.length);
        int rightinorder[] = Arrays.copyOfRange(inorder, mid+1, inorder.length);
        root.right = buildTree(rightpreorder, rightinorder);

        return root;
    }
}

/*
105. Construct Binary Tree from Preorder and Inorder Traversal

Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree 
and inorder is the inorder traversal of the same tree, construct and return the binary tree.

Example 1:
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]

Example 2:
Input: preorder = [-1], inorder = [-1]
Output: [-1]
*/