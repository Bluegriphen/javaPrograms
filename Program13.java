//Maximum number b/w two numbers
//input 10 20 ------>20
import java.util.*;
public class Program13 {
    public static void main(String[] args) {
        int a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}
