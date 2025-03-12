class Solution {
    int countFreq(int[] arr, int target) {
        int last = res(arr,target,true);
        int first = res(arr,target,false);
        if(first != -1)
        {
            return last - first +1;
        }
        else
        {
            return 0;
        }
    }
    private int res(int[]arr, int target, boolean val)
    {
        int n = arr.length;
        int low = 0;
        int high = n -1 ;
        int res = -1;
        while(low <=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > target)
            {
                high = mid-1;
            }
            else if(arr[mid] < target)
            {
                low = mid+1;
            }
            else
            {
                if(val)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
                res = mid;
            }
        }
        return res;
    }
}
/*
Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

Examples :

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: target = 4 is not present in the given array so the output is 0.
Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
Output: 3
Explanation: target = 12 occurs 3 times in the given array so the output is 3.
*/