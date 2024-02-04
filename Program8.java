//Print Even / Odd numbers in given range
import java.util.*;
public class Program8 {
    public static void main(String[] args) {
        int n,i,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        n = sc.nextInt();

       if(n % 2 == 0)
       {

        for(i=0;i<=n;i= i+2){
            sum = sum + i;
        }
        System.out.println("Sum of even no :"+sum );
       }

       else
       {
        for(i=1;i<=n;i=i+2)
        {
            sum= sum + i;
        }
        System.out.println("sum of odd no :"+sum);
       }
    }
}
