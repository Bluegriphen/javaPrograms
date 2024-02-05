/*Calculate Power of a Number */
//input n=5
//power p = 3
//5*5*5
import java.util.*;
public record Program14() {
    public static void main(String[] args) {
        int n , p, result=1;
        System.out.print("Enter number :");
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Enter Power : ");
        p = sc.nextInt();

        for(int i = 1; i<=p ; i++)
        {
            result = n*result;
        }
        System.out.println("Power : " +  result);
    }
    
}
