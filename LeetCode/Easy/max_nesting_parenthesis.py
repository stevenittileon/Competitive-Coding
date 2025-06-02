class Solution(object):
    def maxDepth(self, s):
        stack = []
        count = 0 
        maxi = 0
        for char in s:
            if char == '(':
                stack.append(char)
                count+=1
                maxi = max(maxi, count)
            elif char == ')':
                stack.pop()
                count-=1
            else:
                continue
        return maxi
'''1614. Maximum Nesting Depth of the Parentheses

Given a valid parentheses string s, return the nesting depth of s. 
The nesting depth is the maximum number of nested parentheses.

Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3

Explanation:
Digit 8 is inside of 3 nested parentheses in the string.

Example 2:
Input: s = "(1)+((2))+(((3)))"
Output: 3

Explanation:
Digit 3 is inside of 3 nested parentheses in the string.

Example 3:
Input: s = "()(())((()()))"
Output: 3'''