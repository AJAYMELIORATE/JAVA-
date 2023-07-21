import java.util.*;
class submarine_assessment
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the horizontal submarines : ");
		int n=sc.nextInt();
		int [] a=new int[n];
		int i,j,count=0;
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position:");
		int pos =sc.nextInt();
		int diff=0;
		for(i=0;i<n;i++)
		{
			if(pos>a[i])
			{
				diff=pos-a[i];
			}
			else
			{
				diff=a[i]-pos;
			}
			count+=diff;
		}
	System.out.println(count);
		
	}
}
	