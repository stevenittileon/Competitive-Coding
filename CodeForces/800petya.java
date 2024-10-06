import java.util.*;
public class petya
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        String n1=sc.nextLine();
        String n2=sc.nextLine();
        int n=n1.compareToIgnoreCase(n2);
        if(n>0)
        {
            System.out.println("1");
        }
        else if(n<0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println("0");
        }
    }
}