//print ASCII value of character
//input A----->65
import java.util.*;
public class program11 {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        int a =  ch;
        System.out.println("ASCII value of "+ch+ " is " + a);
    }    
}
