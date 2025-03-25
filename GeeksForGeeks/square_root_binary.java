class Solution {
    int floorSqrt(int n) {
        // Your code here
        if(n ==0 || n == 1){
            return n;
        }
        int left = 1, right = n, ans = 0;
        while(left <= right)
        {
            int mid = (left+right) / 2;
            int pos = mid*mid;
            if(pos == n)
            {
                return mid;
            }
            else if(pos < n)
            {
                ans = mid;
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return ans;
    }
}
/*
quare Root

Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.
Floor value of any number is the greatest Integer which is less than or equal to that number

Examples:

Input: n = 4
Output: 2

Explanation: Since, 4 is a perfect square, so its square root is 2.

Input: n = 11
Output: 3

Explanation: Since, 11 is not a perfect square, floor of square root of 11 is 3.

Input: n = 1
Output: 1
 */