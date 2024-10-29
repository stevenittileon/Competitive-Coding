class Solution:
    def trap(self, height: List[int]) -> int:
        if not height:
            return 0 # checks if nothing is there

        l,r = 0,len(height)-1
        lmax,rmax = height[l],height[r]
        res = 0
        while l<r:# loops till both the pointers meet
            if lmax < rmax:
                l+=1
                lmax = max(lmax,height[l]) ## if this line is exchanged with the one below, we must account for negative values
                res += lmax - height[l]
            else:
                r-=1
                rmax = max(rmax,height[r])## same for this line to account for negative values
                res += rmax - height[r]
        return res

# 42. Trapping Rain Water
# Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

# uses two pointers for this technique to trap water
