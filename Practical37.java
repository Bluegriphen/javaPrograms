                /**Palindrome Number Program */
//input number 121 ----->121

import java.util.*;
public class Practical37 {
    public static void main(String[] args) {
        int n,c,r,a=0;
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;
        while (n>0) {
            r = n % 10;
            a = (a*10)+r;
            n = n/10;
        }
        if(c==a)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
