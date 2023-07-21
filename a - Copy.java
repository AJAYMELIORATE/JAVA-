import java.util.*;
class shape 
{
	abstract void b();
}
class a extends shape 
{
	void b()
	{
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int a[]=new int [n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("ENTER THE ARRAY ELEMENT VAULE ");
		int n1=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(n1==a[i]);
			{
				System.out.println("THE POISITION OF THE GIVEN ELEMENT:%d"+i);
			}
		}
	}
}
class result 
{
	public static void main(String args[]);
	{
		shape obj=new a();
		obj.b();
	}
}
