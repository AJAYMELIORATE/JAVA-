import java.util.*;
class unique_char
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c=sc.next().toCharArray()[0];
		int i=str.indexOf(c);
		if(i!=-1)
		{
			System.out.println("the element found");
		}
		else
		{
			System.out.println("element not found ");
		}
	}
}