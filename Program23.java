        //Area of rectangle program
// input length and breath
// formula length*breath
import java.util.*;
public class Program23 {
    public static void main(String[] args) {
        
        int length,breath,area;
        System.out.print("Enter values of sides : ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breath = sc.nextInt();

        area = length*breath;
        System.out.println("Area of rectangle : " + area);

        //as it is You can use and aply for any sapes like circle, squire, triangle etc....
    }
}
