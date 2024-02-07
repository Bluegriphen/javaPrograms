//          Find squre root of a number
// input Number 25 -------> 5

import java.util.*;
public class Practical39 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter any Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        double m =Math.sqrt(n);
        System.out.println("Square root of "+n+ " is" +m);
    }
}
