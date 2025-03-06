import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int a = 0;
        List<List<Integer>> arr = new ArrayList<>();
        if(target<0 && nums[0]>0) return new ArrayList<>();
        while(a<n-3){
            if (a>0 && nums[a] == nums[a-1]) {
                a++;
                continue;
            }
            int b = a+1;
            while(b<n-2){
                if (b>a+1 && nums[b] == nums[b-1]) {
                    b++;
                    continue;
                }
                int c = b+1;
                int d = n-1;
                while(c<d){
                    long total = nums[a]+nums[b]+nums[c]+nums[d];
                    if(total>target){
                        d--;
                    }
                    else if(total<target){
                        c++;
                    }
                    else{
                        arr.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        while (nums[c] == nums[c-1] && c < d) {
                            c++;
                        }
                    }
                }
                b++;
            }
            a++;
        }
        return arr;
    }
}
/*
18. 4Sum

Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]] 
*/