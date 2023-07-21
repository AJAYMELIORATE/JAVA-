import java.util.*;
class sub_array_1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY: ");
		int n=sc.nextInt();
		int [] a=new int[n];
		int i,j,temp=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				for(j=i+1;j<i+1;j++)
				{

					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println(a[i]); 
		}
		     
		
	}
}
		
