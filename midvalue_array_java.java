import java.util.*;
class midvalue_array_java
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		int i;
		float mid=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(n%2==0)
			{
				mid= (a[(n/2)-1]+a[n/2])/2;
			}
			else 
			{
				mid=(a[n/2]);
			}
		}
		System.out.println(mid);
	}
}	