class Solution:
    def maxDivScore(self, nums: List[int], divisors: List[int]) -> int:
        l=[]
        divisors.sort()
        for i in divisors:
            c=0
            for j in nums:
                if j%i==0:
                    c+=1
            l.append(c)
        return divisors[l.index(max(l))]
            