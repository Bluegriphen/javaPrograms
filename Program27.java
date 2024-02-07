			/** Swap.of.two.Numbers */

import java.util.*;
class Program27
{
	public static void main(String args[])
	{
		int a,b,temp;
		System.out.print("Enter two no:");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b = sc.nextInt();

		System.out.println("Before Swapping"+a+" "+b);

		temp = a;
		a = b;
		b = temp; 

		System.out.println("After Swapping"+a+" "+b);
	}
}