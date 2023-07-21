import java.util.*;
class largest_divident
{
	public static int main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,count,factors,k,j;
		System.out.print("ENTER THE K VALUE");
		k=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				factors=count ;
			}
		}
		int arr[]=new int[factors];
		for(j=0;j<factors;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(j=0;j<factors;j++)
		{
			if(arr[k]>arr[factors-1])
			{
				System.out.println("%d"+arr[j]);
			}
		}
	}
}	
