        /*Count number of Digits */
// input 343---------> 3
import java.util.*;
public class Program18 {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.print("Enter value : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n >0) {
            n= n / 10;
            count++;
        }
        System.out.println("No. of digits "+count);
    }
}
