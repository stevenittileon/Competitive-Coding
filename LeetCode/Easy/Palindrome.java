class Solution 
{
    public boolean isPalindrome(int x) 
    {
        String s = String.valueOf(x);// convert number to a string
        int n=s.length();//find the length of the string
        for(int i=0; i<n/2;i++)// loop till the middle
        {
            if(s.charAt(i) != s.charAt(n-i-1))// check if they are the same from two ends
            {
                return false;
            }
        }
        return true;// returns true if no problems occur
    }
}
