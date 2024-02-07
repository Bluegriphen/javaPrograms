	/** Area of Square */
// area = side*side;

import java.util.*;
class code2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int side,area;
		System.out.print("Enter size od square's side : ");
		side = sc.nextInt();

		area = side*side;
		System.out.println("Area of square is :"+area);

	}
}