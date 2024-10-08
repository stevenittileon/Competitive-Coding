class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        arr2 = {}
        for i in arr:
            if i in arr2:
                arr2[i] += 1
            else:
                arr2[i] = 1
        key1 = list(arr2.keys())
        val1 = list(arr2.values())
        maxval = max(val1)
        ind = val1.index(maxval)
        return key1[ind]

# Given an integer array sorted in non-decreasing order, there is exactly one integer in the array
# that occurs more than 25% of the time, return that integer.
