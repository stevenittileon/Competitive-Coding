public class maxnumsentence 
{
    public int mostWordsFound(String[] sentences) 
    {
        int l=sentences.length;
        int k=0;
        for(int i=0;i<l;i++)//takes each part of the string array
        {
            String s[]= sentences[i].split(" ");//splits at every whitespace
            int n=s.length;//takes length of the split array
            if(n>k)//checks if it is the biggest
            {
                k=n;
            }
        }
        return k;//returns biggest
    }
}

// You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//Return the maximum number of words that appear in a single sentence.


