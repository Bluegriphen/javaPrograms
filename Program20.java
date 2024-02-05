//Print Muliplication
//input number 6 
// 6 * 1 = 6
//        ...
// 6 * 10 = 60
// here we difined 6 but you can define any number =
import java.util.*;
public class Program20 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter any number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //for multilication for loop is easy to use

        for(int i=1; i<=10; i++)
        {
            
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
    
}
