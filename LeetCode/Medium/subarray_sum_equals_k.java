import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0, sum=0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);

        for(int num: nums){
            sum+=num;
            if(prefixSum.containsKey(sum-k)){
                count+=prefixSum.get(sum-k);
            }
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
/*
560. Subarray Sum Equals K

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 */