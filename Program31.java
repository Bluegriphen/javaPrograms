			/** Leap.year.Program*/
// 1. century (100% = 0 and 400% = 0) 2000 2004
// 2. yearly  (100% !=0 and 4% = 0) 2020 2024 
import java.util.*;
class Program31
{
	public static void main(String args[])
	{
		int y;
		System.out.println("Enter any year:");
		Scanner sc = new Scanner(System.in);
		y=sc.nextInt();
		
		if(y % 100==0 && y % 400 ==0 || y % 100!=0 && y % 4 ==0)
 		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("None leap year");
		}
	}	
}