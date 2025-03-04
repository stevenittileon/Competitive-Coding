import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        List<Integer> maj = new ArrayList<>();
        int thres = nums.length / 3;

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int ele = entry.getKey();
            int count = entry.getValue();
            if(count > thres)
            {
                maj.add(ele);
            }
        }
        return maj;
    }
}
/*
229. Majority Element II

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2] 
*/