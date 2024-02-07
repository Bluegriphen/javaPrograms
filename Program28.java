			/** Swapping without third variable*/
// a = 10 b = 20
// a = 20 b = 10

import java.util.*;
class Program28
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter any two numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
	
		System.out.println("Before Swapping : " + a+" "+b);

		a = a+b;       //10 +20 30
		b = a-b;       //30-20 10
		a = a-b;       //30-10 20
		
		System.out.println("After swapping : "+a+" " +b);
	}
}