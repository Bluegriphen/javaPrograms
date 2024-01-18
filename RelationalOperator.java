import java.util.*;
public class RelationalOperator {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two Numbers...");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("a<b is true/false:"+(a<b));
        System.out.println("a>b is true/false:"+(a>b));
        System.out.println("a<=b is true/false:"+(a<=b));
        System.out.println("a>=b is true/false:"+(a>=b));
        System.out.println("a==b is true/false:"+(a==b));
        System.out.println("a!=b is true/false:"+(a!=b));
    }
}
