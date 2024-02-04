//Vowel or Consonant in java
import java.util.*;
public class Program10 {
    //input a e i o u --->vowel
    //input b c d etc....
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'|| ch == 'o' || ch=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
