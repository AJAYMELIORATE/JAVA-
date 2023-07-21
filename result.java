import java.util.*;
class a
{
	void b()
	{
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int [] a=new int [n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int n1=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==n1);
			{
				System.out.println(i);
			}
		}
	}
}
class c extends a
{
	void d()
	{
		System.out.println();
	}
}
class result 
{
	public static void main(String args[]);
	{
		c obj=new c();
		obj.b();
		obj.d();
	}
}
