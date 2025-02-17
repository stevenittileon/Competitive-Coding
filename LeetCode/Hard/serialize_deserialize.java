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

 public class serialize_deserialize {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfsSerialize(root,res);
        return String.join(",",res);
    }

    private void dfsSerialize(TreeNode node, List<String> res)
    {
        if(node == null)
        {
            res.add("N");
            return;
        }
        res.add(String.valueOf(node.val));
        dfsSerialize(node.left, res);
        dfsSerialize(node.right, res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String vals[] = data.split(",");
        int i[] = {0};
        return dfsDeserialize(vals,i);
    }

    private TreeNode dfsDeserialize(String vals[], int i[])
    {
        if(vals[i[0]].equals("N"))
        {
            i[0]++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(vals[i[0]]));
        i[0]++;
        node.left = dfsDeserialize(vals,i);
        node.right = dfsDeserialize(vals,i);
        return node;
    }
}

/*
297. Serialize and Deserialize Binary Tree

Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file 
or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. 
There is no restriction on how your serialization/deserialization algorithm should work. 
You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

Clarification: The input/output format is the same as how LeetCode serializes a binary tree. 
You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.

Example 1:
Input: root = [1,2,3,null,null,4,5]
Output: [1,2,3,null,null,4,5]

Example 2:
Input: root = []
Output: [] 
*/