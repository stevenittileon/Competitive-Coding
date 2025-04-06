class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }

        int start = 0, end = 0;
        for(int i = 0; i<s.length(); i++){
            int odd = expandcenter(s,i,i);
            int even = expandcenter(s, i, i+1);
            int max_len = Math.max(odd, even);

            if(max_len > end - start){
                start = i - (max_len -1)/2;
                end = i + max_len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandcenter(String s, int left, int right){
        while( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
/*
5. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */