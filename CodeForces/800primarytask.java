import java.util.*;
public class primarytask
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            String d=Integer.toString(arr[j]);
            if(d.length() < 3)
            {
                System.out.println("NO");
            }
            if(d.length()==3 && d.substring(2).equals("1"))
            {
                System.out.println("NO");
            }
            if(d.substring(0,2).equals("10"))
            {
                if(d.substring(2,3).equals("0"))
                {
                    System.out.println("NO");
                }
                else
                {
                    System.out.println("YES");
                }
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
