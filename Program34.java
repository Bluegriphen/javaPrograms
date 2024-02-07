				//A program to find whether the given number is divisible by 5 or not.

				
import java.util.*;
class Program34
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n = s.nextInt();
		if(n%5==0)
		{
			System.out.println(n + "is divisible by 5");
		}
		else
		{
			System.out.println(n + "is not divisible by 5");
		}
	}
}