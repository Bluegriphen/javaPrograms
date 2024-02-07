//              Prime number b/w two numbers
// input first number 19
//input second number 20
//prime nubmer -----> 11 13 17 19 


import java.util.*;
public class Program42 {
    public static void main(String[] args) {
        int n1,n2,j,i;
        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(i =n1;i<=n2;i++)
        {
            for(j = 2; j<=i;j++)
            {
                if(i%j==0)
                    break;

                
            }
            if(i==j)
                {
                    System.out.print(j+" ");
                }
            
        }
    }    
}
