//Sum of first N Ntural number
import java.util.*;
public class Program7 {
    public static void main(String[] args) {
        int n , sum = 0;
        System.out.print("Enter no of term ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i<= n; i++)
        {
            sum = sum + i;

        }
        System.out.println("Addition : " +sum);
    }

}
