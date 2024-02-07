				/**Enter code of Day and print Name  of Day */
	//input code(1 to 6)

import java.util.*;
class Program32
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number between 0 to 6 : ");
		int n = sc.nextInt();
		
		switch(n)
		{
			case 0 :
			System.out.println("Sunday");
			break;

			case 1 :
			System.out.println("Monday");
			break;
			
			case 2 :
			System.out.println("Tuesday");
			break;

			case 3 :
			System.out.println("Wednesday");
			break;

			case 4 :
			System.out.println("Thirsday");
			break;

			case 5 :
			System.out.println("Friday");
			break;

			case 6 :
			System.out.println("Saterdat");
			break;
			
			default:
			System.out.println("Invailid");
			break;

		}
	}
}