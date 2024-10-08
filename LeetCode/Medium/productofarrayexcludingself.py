class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res= [1] * (len(nums)) # keeps results default as 1
        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix # finds prefixes of all values and stores in result
            prefix *= nums[i]
        
        postfix = 1
        for i in range(len(nums) -1, -1, -1): # loop goes backwards
            res[i] *= postfix # multiplies the prefix and postfix into results
            postfix *= nums[i]

        return res

# Given an integer array nums, return an array output where output[i] 
# is the product of all the elements of nums except nums[i]