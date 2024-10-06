import java.util.Scanner;
public class CAPITAL
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String imp=str.substring(0,1).toUpperCase()+ str.substring(1);
        System.out.println(imp);
    }
}