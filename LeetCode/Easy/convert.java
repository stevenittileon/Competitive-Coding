class Solution 
{
    public int[][] construct2DArray(int[] original, int m, int n) 
    {
        int a[][]= new int[m][n];
        int f=0;
        if(original.length != m*n)
        {
            return new int[0][0]; // returns an empty array of []
        }
        else
        {
            for(int i=0; i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]= original[f];
                    f++;
                }
            }
            return a;
        }
    }
}
