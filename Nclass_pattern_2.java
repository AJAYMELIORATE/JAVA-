import java.util.*;
class Nclass_pattern_2
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if((j==n/2 && (i==0 || i==n-1)) || (i==n/2 && (j==0 || j==n-1)))
				{
					System.out.print("*\t");
				}
				else if(j==0 || j==n-1)
				{
					System.out.printf(arr[i][j]+7 +"\t");
				}
				else if(arr[i][j] % 7 ==0)
				{
					System.out.printf(arr[i][j] +"\t");
				}
			}
			System.out.println();
		}
		
	}
}