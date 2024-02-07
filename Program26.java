		/**  Area of Triangle */
// input  a , b , c
// 1. find semiperimeter
// 2. area of triangle

import java.util.*;
class Program26
{
	public static void main(String[] args)
	{
		int  a, b , c,sp;
		double area;
		System.out.println("Enter value for sides of Triangle : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		sp = (a + b + c)/2;
		area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.print("Area of Triangle : " + area);
	}
}