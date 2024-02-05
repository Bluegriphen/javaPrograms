//Find factorial of a Number
//input as 5 ----> 120 (5*4*3*2*1)
import java.util.*;
public class program17 {
    public static void main(String[] args) {
        int fact=1,n;
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //you can use other loop 
        for(int i=1; i<=n;i++)
        {
            fact = i * fact;
        }
        System.out.println("factorial "+fact);
    }    
}
