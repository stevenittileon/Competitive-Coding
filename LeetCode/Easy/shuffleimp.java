//MY CODE

class Solution {
    public String restoreString(String s, int[] indices) {
        String str="";
        for(int i=0;i<indices.length;i++)
        {
            for(int j=0;j<indices.length;j++)
            {
                if(i==indices[j])
                {
                    str=str+s.charAt(j);
                }
            }
        }
        return str;
    }
}

//BETTER IMPLEMENTATION WITH BETTER TIME

class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        char[] chr = new char[s.length()];
		for(int i=0;i<s.length();i++) 
        {
			chr[indices[i]] = s.charAt(i);
		}
		return String.valueOf(chr);
    }
}
// THIS ONE USED ONE LOOP AND USED A SEPARATE ARRAY TO BUILT THE ANSWER