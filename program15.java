/**Find greatest number among three Numbers */
//input 10 20 30 ----> 30

import java.util.*;
public class program15 {
    public static void main(String[] args) {
        int a , b , c;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number :");
        a = sc.nextInt();
        System.out.println("Enter second number :");
        b = sc.nextInt();
        System.out.println("Enter third number :");
        c = sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a + " is grater");
            }
            else
            {
                System.out.println(c + " is grater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b + " is grater");
            }
            else
            {
                System.out.println(c + " is grater");
            }
        }
        
    }
}
