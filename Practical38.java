        /**Armstrong Number Program */
//input number 153 ------>(1*1*1 + 5*5*5 + 3*3*3 = 153)

import java.util.*;
public class Practical38 {
    public static void main(String[] args) {
        int n,rem,arm = 0,c;
        System.out.println("Enter any number : ");
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c=n;
       
        while (n > 0) {
            rem=n % 10;
            arm = (rem*rem*rem)+arm;
            n=n/10;
        
        }
        if(c==arm)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong number");
        }
    }    
}
