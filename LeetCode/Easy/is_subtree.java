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

 class is_subtree 
 {  
     public boolean isSubtree(TreeNode root, TreeNode subRoot) 
     {
         if(root == null)
         {
             return false;
         }
         if (subRoot == null)
         {
             return true;
         }
         if(sameTree(root,subRoot))
         {
             return true;
         }
         return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
     }
 
     public boolean sameTree(TreeNode root, TreeNode subRoot) 
     {
         if (root == null && subRoot == null) {
             return true;
         }
         if (root != null && subRoot != null && root.val == subRoot.val) {
             return sameTree(root.left, subRoot.left) && sameTree(root.right, subRoot.right);
         }
         return false;
     }
 }


/*
572. Subtree of Another Tree

Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure 
and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. 
The tree tree could also be considered as a subtree of itself.

Example 1:
Input: root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true

Example 2:
Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
Output: false
 */
