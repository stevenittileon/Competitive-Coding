import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1; i <= numRows; i++)
        {
            List<Integer> arl = new ArrayList<>();
            arl.add(1);
            int prev = 1;
            for(int j = 1; j< i; j++)
            {
                prev = (prev*(i-j)) / j;
                arl.add(prev);
            }
            res.add(arl);
        }
        return res;
    }
}
/*
118. Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]] 
*/