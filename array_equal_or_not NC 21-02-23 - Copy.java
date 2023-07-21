import java.util.*;
class array_equal_or_not
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("array 'a' size: ");
		int a=sc.nextInt();
		System.out.println("array 'b' size: ");
		int b=sc.nextInt();
		int arr1[]=new int[a];
		int arr2[]=new int[b];
		int i,j;
		System.out.println("enter the a array elements: ");
		for(i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the b array elements: ");
		for(j=0;j<b;j++)
		{
			arr2[j]=sc.nextInt();
		}
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				if(arr1[i]=arr2[j])
				{
					System.out.println("YES");
			    }
		        else
			    {
				    System.out.println("NO");
		        }	
			}
		}
	}
}