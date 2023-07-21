import java.util.*;
class frequency_array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int fre[]=new int[n];
		int visit=-1;
		for(i=0;i<n;i++)
		{
			int count=1;
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fre[j]=count ;
				}
			}
			if(fre[i]!=visit)
			{
				fre[i]=count;
			}
			System.out.println(arr[i] + "    "+fre[i]);
			
		}
	}
}