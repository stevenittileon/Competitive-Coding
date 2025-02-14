import java.util.*;
public class TooManyWords_800
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n1;i++)
        {
            String word = sc.nextLine();
            if(word.length() < 10)
            {
                System.out.println(word.length());
            }
            else{
                System.out.println(word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
            }
        }
        sc.close();
    }
}

/*
Let's consider a word too long, if its length is strictly more than 10 characters. 
All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word 
and between them we write the number of letters between the first and the last letters. 


Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

Input
The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

Output
Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.

Examples
InputCopy
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
OutputCopy
word
l10n
i18n
p43s
 */