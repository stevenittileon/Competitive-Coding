import java.util.*;
public class new_year_and_hurry_800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rem = 240 - k;
        int sum = 0;
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += 5 * i;
            if (sum > rem) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}