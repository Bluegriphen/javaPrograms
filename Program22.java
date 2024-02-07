//Calculator Program in java
// input n1,n2 ------> (Select Operation) Result

import java.util.*;
public class Program22 {

    public static void main(String[] args) {
        
        int n1,n2,ch,cal;
        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.print("Select Operation : ");
        ch = sc.nextInt();  
        
        //for addtion
        if(ch == 1)
        {
          
            cal = n1 + n2;
            System.out.println("ADDITION : "+cal);
        }
        //for substraction
        else if(ch == 2)
        {
            cal = n1 - n2;
            System.out.println("SUBSTRACTION :"+cal);
        }
        //for Multiplication
        else if(ch == 3)
        {
            cal = n1 * n2;
            System.out.println("MULTIPLICATION : "+cal);
        }
        //for devision
        else if(ch == 4)
        {
            cal = n1 / n2;
            System.out.println("DIVISION : "+cal);
        }
        //for Modulo/remainder
        else
        {
            cal = n1 % n2;
            System.out.println("REMAINDER : "+cal);
        }
    }
}
