/**Eligible for Vote or not */
// inputg age >=18 ------>vote
// input age <18-------->not
import java.util.*;
public class Program19 {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter Your age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age<=18)
        {
            System.out.println("You are not eligible for votes");
        }
        else
        {
            System.out.println("You are  eligible for vote");
        }
    }
}
