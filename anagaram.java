import java.util.*;
class anagaram_string 
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string 1");
		String str1 = sc.nextLine();
		System.out.print("ENTER THE SECOND STRING");
		String str2 = sc.nextLine();
		int a=str1.length();
		int b=str2.length();
		if(a != b)
		{
			System.out.print("THE GIVEN STRINGS ARE INVALID");
		}
		char c[]=new char[a];
		char d[]=new char[b];
		if(c==d)
		{
			System.out.println("the given strings are anagaram");
		}
		else 
		{
			System.out.println("THE GIVEN STRINGS ARE NOT AN ANAGRAM");
		}
	}
}