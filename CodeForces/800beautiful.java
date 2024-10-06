import java.util.*;
public class beautiful
{
    public static void main(String[] args) 
    {
        int f=0;
        int k=2,l=2; 
        int arr[][]= new int[5][5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(arr[i][j]==1)
                {
                    k=i;
                    l=j;
                }
            }
        }
        while(k!=2 || l!=2)
        {
            if(k>2)
            {
                k--;
                f++;
            }
            else if(k<2)
            {
                k++;
                f++;
                continue;
            }
            else if(l>2)
            {
                l--;
                f++;
                continue;
            }
            else if(l<2){
                l++;
                f++;
                continue;
            }
            else
            {
                break;
            }
        }
        System.out.println(f);
    }
}