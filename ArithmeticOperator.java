
import java.util.*;

public class ArithmeticOperator {
    
  public static void main(String[] args) {
   
    int a,b;
    System.out.print("Enter two numbers:");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    
    System.out.println("Addition =" +(a+b));
    System.out.println("Substraction =" +(a-b));
    System.out.println("Multiplication =" +(a*b));
    System.out.println("Division =" +(a/b));
    System.out.println("Modulo =" +(a%b));
    }
}
