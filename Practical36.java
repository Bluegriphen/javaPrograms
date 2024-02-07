                    //sum of Digits Program
//innput suppose 126 ---------->(1+2+6 = 9)                    
import java.util.Scanner;
public class Practical36 {
    public static void main(String[] args) {
        int n,r,sum = 0;
        System.out.println("Enter any Number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n>0)
        {
            r = n % 10;
            sum = sum + r;
            n = n / 10;

        }
        System.out.println("Sum of digits : "+ sum);
    }
}