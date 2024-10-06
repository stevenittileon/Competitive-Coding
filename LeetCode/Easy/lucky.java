import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int max= -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==-1)
            {
                continue;
            }
            int count=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            if(count == arr[i])
            {
                max= Math.max(max,arr[i]);
            }
            for(int j=i; j<i+count;j++)
            {
                arr[j]=-1;
            }
        }
        return max;
    }
}
