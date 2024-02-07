//              Prime Number program 
//input number  7 ---> Prime Number
import java.util.*;
public class Practical40 {
    public static void main(String[] args) {
        int n, flag = 1;
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        
        for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    flag=0;
                
                }
            }
        
        if(flag == 1)
        System.out.println("Prime number");
        else
        System.out.println("Not Prime Number");
    }
}
