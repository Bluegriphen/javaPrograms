                /**Reverse Number Program */

import java.util.Scanner;
public class Practical35 {
    public static void main(String[] args) {
        int n,r;
        System.out.print("Enter any number : ");
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n>0) {
            r = n % 10;
            System.out.print(" "+r);
            n = n/10;
        }
        
    }
}
