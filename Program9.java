//print character in java
import java.util.*;
public class Program9 {
    //input 10---->10
    //input A---->A
       public static void main(String[] args) {
        char ch;
        System.out.println("Please Enter character : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        System.out.println(ch);
    }
}
