class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        longest = 0

        for n in nums:
            if (n - 1) not in numSet:
                length = 0
                while (n + length) in numSet:
                    length += 1
                longest = max(longest, length)
        return longest

# very simple medium problem
# Input: [1,200,2,3,4,100]
# Output: 4
# because longest consecutive sequence is [1,2,3,4]