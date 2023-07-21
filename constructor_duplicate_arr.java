import java.util.*;
class constructor_duplicate_arr
{
	public constructor_duplicate_arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,j,count=0;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count=arr[i];
					count ++;
				}
			}
		}
		System.out.println("MY REAPETED ELEMENT"+arr[i]);
	}
	public static void main(String args [])
	{
		constructor_duplicate_arr obj=new constructor_duplicate_arr();
	}
}
		
		
		
		
		