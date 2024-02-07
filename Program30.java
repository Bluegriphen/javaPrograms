				/** check number is positive or Negative */
//  input n>0 +ve Number
// input n<0  -ve Number
//input n==0 Neither +ve Nor -ve

import java.util.*;
class Program30
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter any one numbeer : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
	
		if(n>0)
		{
			System.out.println(n+" is Positive Number");
		}
		else if(n==0)
		{
			System.out.println(n+" equal Number");
		}
		else
		{

			System.out.println(n+"is Negetive Number");
		}
	}
}