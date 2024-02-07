//                  Perfect Number Program
//input  number 6 ----------> 1 2 3 4 5
// 6 -------> 1 + 2 + 3

import java.util.*;
class Practical41{
    public static void main(String[] args) {
    int n,sum=0;
    System.out.println("Enter any Number :");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    
    for(int i = 1 ; i<n ; i++)
    {
        if(n % i==0)
        {
            sum=sum+i;
        }
    }
    if(n==sum)
    {
        System.out.println("Perfect Number");
    }
    else
    {
        System.out.println("Not Perfect Number");
    }
    }    
}