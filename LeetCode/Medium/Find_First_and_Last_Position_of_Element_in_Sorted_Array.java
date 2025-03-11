class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findpos(nums, target, true);
        int second = findpos(nums, target, false);
        return new int[]{first,second};
    }

    private int findpos(int nums[], int target, boolean val)
    {
        int left = 0;
        int right = nums.length-1;
        int pos = -1;
        while(left<= right)
        {
            int mid = (left+right)/2;
            if(nums[mid] == target)
            {
                pos = mid;
                if(val)
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid+1;
                }
            }
            else if(nums[mid] < target)
            {
                left = mid+1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return pos;
    }
}
/*
834. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
*/