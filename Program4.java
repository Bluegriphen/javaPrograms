//create a program for Even / Odd number
import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter value : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
