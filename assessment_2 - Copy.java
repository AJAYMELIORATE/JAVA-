import java.util.Scanner;

class assessment_2 
{
    public static void main(String[] args)
    {
       
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int [r][c];
		int i,j,count=0,max=0,index=0;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(a[i][j]==1)
				{
					count++;
				}
				if(count> max)
				{
					count=max;
					index=i;
				}
			}
		}
		System.out.println(index+1);
	}
				
		
}
