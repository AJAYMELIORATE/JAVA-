//try catch
import java.lang.Throwable;
import java.util.*;
class sample 
{
	public static void main(String args [])
	{
		sample obj =new sample ();
		obj.divide();
		obj.add();
	}
	void add()
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try
		{
			int result=n1/n2;
			System.out.println("Division"+result);
		}
		catch(arthematic exception e)
		{
			System.out.println("please cheak the no2 value ");
			divide ();
		}
	}
}