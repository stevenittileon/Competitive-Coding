import java.util.*;
class meanarray {
    public double trimMean(int[] arr) 
    {
        double mean=0.0;
        Arrays.sort(arr);//sorts the array first
        int del=(int)(0.05 * arr.length);// finds the bottom 5%
        for(int i=del;i<(arr.length - del);i++) // loops starts from after the bottom 5% and goes on till it reaches the top 5%
        {
            mean=mean+arr[i]; //takes sum
        }
        mean=mean/(arr.length - 2 * del);//finds mean of it
        return mean;
    }
}

//Given an integer array arr, return the mean of the remaining integers after removing t
//he smallest 5% and the largest 5% of the elements.

//Answers within 10-5 of the actual answer will be considered accepted.

//Example

//Input: arr = [1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3]
//Output: 2.00000
//Explanation: After erasing the minimum and the maximum values of this array, all elements are equal to 2, so the mean is 2.