class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l,r = 1,max(piles) # since right max eating speed will always be the max of the piles and left speed is base 1
        res = r
        while l<=r:# binary search for finding speed
            k=(l+r)//2
            hours = 0
            for p in piles:
                hours += math.ceil(p/k)
            
            if hours <= h: # checks if we can get a lower speed of eating
                res = min(res , k)# takes lowest possible time to finish
                r = k - 1
            else:
                l = k + 1
        return res

'''
875. Koko Eating Bananas

Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. 
The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. 
If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
'''