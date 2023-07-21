import java.util.*;
class anagarams
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string 1");
		String str1 = sc.nextLine();
		System.out.print("ENTER THE SECOND STRING");
		String str2 = sc.nextLine();
		int a=str1.length();
		int b=str2.length();
		char c[]=new char[a];
		char d[]=new char[b];
		if(str1!=str2)
		{
			System.out.print("invalid");
		}
		Arrays.sort(c);
		Arrays.sort(d);
		boolean result=Arrays.equals(a,d);
		if(result)
		{
			System.out.println("the given strings are anagaram");
		}
		else 
		{
			System.out.println("THE GIVEN STRINGS ARE NOT AN ANAGRAM");
		}
	}
}
  
