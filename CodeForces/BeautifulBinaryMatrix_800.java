import java.io.*;
import java.util.*;

public class BeautifulBinaryMatrix_800 
{
    // Function to check if n is a perfect square
    private static int isPerfectSquare(int n) 
    {
        int root = (int) Math.sqrt(n);
        return (root * root == n) ? root : -1;
    }
    
    // Function to check if the given string can be a square beautiful matrix
    private static String isBeautifulMatrix(int n, String s) 
    {
        int r = isPerfectSquare(n);
        if (r == -1) 
        {
            return "No"; // n is not a perfect square
        }

        // Check first and last row
        if (!s.substring(0, r).equals("1".repeat(r)) || !s.substring(n - r).equals("1".repeat(r))) 
        {
            return "No";
        }

        // Check first and last column
        for (int i = 1; i < r - 1; i++) 
        {
            if (s.charAt(i * r) != '1' || s.charAt(i * r + r - 1) != '1') 
            {
                return "No";
            }
        }

        // Check the inner elements
        for (int i = 1; i < r - 1; i++) 
        {
            for (int j = 1; j < r - 1; j++) 
            {
                if (s.charAt(i * r + j) != '0') 
                {
                    return "No";
                }
            }
        }

        return "Yes";
    }

    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder output = new StringBuilder();
        
        while (t-- > 0) 
        {
            int n = Integer.parseInt(br.readLine().trim()); // Length of the string
            String s = br.readLine().trim(); // Binary string
            
            output.append(isBeautifulMatrix(n, s)).append("\n");
        }
        System.out.print(output);
    }
}