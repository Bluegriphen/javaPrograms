				/** convert character Lower case to Upper case & vice-versa */
//input a to z ---->Uppercase
//input A to Z ----->Lowercase


import java.util.*;
class Program29
{
	public static void main(String args[])
	{
		char ch,ch2;
		System.out.println("Enter any character : ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch<='Z')
		{
			ch2=Character.toLowerCase(ch);
			System.out.println(ch2);
		}
		else
		{
			ch2=Character.toUpperCase(ch);
			System.out.println(ch2);
		}
		
	}
}