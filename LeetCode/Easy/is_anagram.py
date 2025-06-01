class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
        for x in set(s):
            if s.count(x) != t.count(x):
                return False
        return True
'''242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false'''